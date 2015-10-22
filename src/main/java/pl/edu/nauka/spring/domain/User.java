package pl.edu.nauka.spring.domain;

import pl.edu.nauka.spring.controler.Book;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by P on 2015-10-22.
 */
@Entity(name = "Users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String password;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    private List<Book> books = new ArrayList<>();

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
