package com.example.demojpa4.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @PostMapping("/create")
    public void createBook(@RequestBody CreateRequest request) {

    }
}
