package com.example.demojpa4.demo;

import com.example.demojpa4.demo.Model.Book;
import com.example.demojpa4.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {

		Book b1 = new Book();
		b1.setId(101);
		b1.setCost(1000);
		b1.setName("Maths");
		b1.setAuthorName("Vipul");
		bookRepository.save(b1);
		// commandLineRunner is used for removing the temporary files or some other things.

	}
}
