package pl.edu.nauka.spring.controler;

import pl.edu.nauka.spring.domain.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by P on 2015-10-22.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String titme;

    @ManyToOne
    private User user;
}
