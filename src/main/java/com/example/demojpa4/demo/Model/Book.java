package com.example.demojpa4.demo.Model;

import javax.persistence.*;

@Entity
public class Book {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String authorName;
    private int cost;

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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
