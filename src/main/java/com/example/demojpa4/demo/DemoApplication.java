package com.example.demojpa4.demo;

import com.example.demojpa4.demo.Model.Book;
import com.example.demojpa4.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {

		List<Book> bookList = new ArrayList<Book>();

		Book b1 = new Book(2, "Art", "Picasso", 200);
		Book b2 = new Book(4, "Science", "Newton", 250);

		bookList.add(b1);
		bookList.add(b2);

		bookRepository.saveAll(bookList);


//		System.out.println(bookRepository.findAll());
//		System.out.println(bookRepository.findByAuthorName("Newton"));
//		System.out.println(bookRepository.findByAuthor("Picasso"));
		System.out.println(bookRepository.findByAuthors("Newton"));
		// commandLineRunner is used for removing the temporary files or some other things.

	}
}
