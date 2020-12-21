package com.example.demojpa4.demo.Repository;

import com.example.demojpa4.demo.Model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {

}
