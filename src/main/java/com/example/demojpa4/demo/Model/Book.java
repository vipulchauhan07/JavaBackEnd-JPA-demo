package com.example.demojpa4.demo.Model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String authorName;
    private int cost;


    @ManyToOne
    @JoinColumn
    private BookCategory bookCategory;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getCost() {
        return cost;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Book( String name, String authorName, int cost) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

    public Book(String name, String authorName, int cost, int bookCategory) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
        this.bookCategory = new BookCategory();
        this.bookCategory.setId(bookCategory);
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "{ Id " + this.getId() + " Name " + this.getName() + " Author Name " + this.getAuthorName()
                + " cost " + this.getCost() + "}";
    }
}
