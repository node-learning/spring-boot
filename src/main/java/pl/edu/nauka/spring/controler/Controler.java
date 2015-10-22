package pl.edu.nauka.spring.controler;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.nauka.spring.dao.UserDao;
import pl.edu.nauka.spring.domain.User;

import java.util.List;

/**
 * Created by P on 2015-10-22.
 */
@RestController
public class Controler {

    @Autowired
    UserDao userDao;

    @RequestMapping("/get")
    public User getUserByName(@RequestParam("name") String name) {
        List<User> users = Lists.newArrayList(userDao.findAll());
        return users.stream().filter(user -> user.getName().equals(name)).findAny().orElse(null);
    }

    @RequestMapping("/add")
    public User addUser(@RequestParam("name") String name,@RequestParam("password") String password) {
        User user = new User(name,password);
        userDao.save(user);
        return user;
    }
}
