package com.example.demojpa4.demo.Model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    private int id;
    private String name;
    private String authorName;
    private int cost;

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

    public Book(int id, String name, String authorName, int cost) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "{ Id " + this.getId() + " Name " + this.getName() + " Author Name " + this.getAuthorName()
                + " cost " + this.getCost() + "}";
    }
}
