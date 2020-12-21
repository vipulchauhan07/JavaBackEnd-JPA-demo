package com.example.demojpa4.demo;

import com.example.demojpa4.demo.Model.Book;
import com.example.demojpa4.demo.Model.BookCategory;
import com.example.demojpa4.demo.Repository.BookCategoryRepository;
import com.example.demojpa4.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Autowired
	BookCategoryRepository bookCategoryRepository;


	@Override
	public void run(String... args) throws Exception {

		Set<Book> bookList = new HashSet<>();


		bookCategoryRepository.save((new BookCategory("Programming Languages")));
		bookCategoryRepository.save((new BookCategory("Non-programming Languages")));

		Book b1 = new Book("C Programming ", "Denis Rechie", 200,1);
		Book b2 = new Book("Python Programming", "von-neh man", 250,1);
		Book b3 = new Book("Natural Language", "Vipul", 3000,2);

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
//		bookRepository.saveAll(bookList);

		bookRepository.saveAll(bookList);

		System.out.println(bookRepository.findByAuthors("Denis Rechie"));
		// commandLineRunner is used for removing the temporary files or some other things.

	}
}
