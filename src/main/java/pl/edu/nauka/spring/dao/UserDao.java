package pl.edu.nauka.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.nauka.spring.domain.User;

/**
 * Created by P on 2015-10-22.
 */
@Repository
public interface UserDao extends CrudRepository<User,Long>{
}
