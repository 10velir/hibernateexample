package com.javacodegeeks.snippets.enterprise.hibernate;

import java.util.List;

import com.javacodegeeks.snippets.enterprise.hibernate.model.Book;
import com.javacodegeeks.snippets.enterprise.hibernate.service.BookService;

public class App {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		Book book1 = new Book(3, "The Brothers", "Fyodor");
		bookService.persist(book1);
		List<Book> books1 = bookService.findAll();
		System.out.println("Books Persisted are :");
		for (Book b : books1) {
			System.out.println("-" + b.toString());
		}
	}
}
