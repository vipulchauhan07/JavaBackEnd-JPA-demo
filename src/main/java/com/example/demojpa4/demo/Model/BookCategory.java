package com.example.demojpa4.demo.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String name;

    // one-> current class
    // many-> other class

    // therefore here, many books have one category or in other words one category have many books

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private Set<Book> bookSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory() {
    }

    public BookCategory(String name, Set<Book> bookSet) {
        this.name = name;
        this.bookSet = bookSet;
        this.bookSet.forEach(x -> x.setBookCategory(this));
    }
}
