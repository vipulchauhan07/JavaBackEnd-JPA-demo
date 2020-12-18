package com.example.demojpa4.demo.Repository;

import com.example.demojpa4.demo.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
