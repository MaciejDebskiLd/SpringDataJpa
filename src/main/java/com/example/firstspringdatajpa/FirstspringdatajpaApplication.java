package com.example.firstspringdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstspringdatajpaApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(FirstspringdatajpaApplication.class);

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstspringdatajpaApplication.class, args);

	}

	@Override
	public void run(String... args) {
		bookRepository.save(new Book("Java"));
		bookRepository.save(new Book("Python dla odwaznych"));
		bookRepository.save(new Book("Pan Kleks"));

		System.out.println("\nfindAll()");
		bookRepository.findAll().forEach(x -> System.out.println(x));

		System.out.println("\nfindById(1L)");
		bookRepository.findById(1L).ifPresent(x -> System.out.println(x));

		System.out.println("\nfindByName('Java')");
		bookRepository.findByTitle("Pan Kleks").forEach(x -> System.out.println(x));

		System.out.println("\ndeleteById(3L)");
		bookRepository.deleteById(3L);
		System.out.println("\nfindAll()");
		bookRepository.findAll().forEach(x -> System.out.println(x));





	}
}
