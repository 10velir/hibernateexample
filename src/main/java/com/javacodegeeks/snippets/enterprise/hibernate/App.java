package com.javacodegeeks.snippets.enterprise.hibernate;

import java.util.List;

import com.javacodegeeks.snippets.enterprise.hibernate.dao.reposytories.BookRepository;
import com.javacodegeeks.snippets.enterprise.hibernate.model.Book;
import com.javacodegeeks.snippets.enterprise.hibernate.service.BookService;
import com.javacodegeeks.snippets.enterprise.hibernate.service.impl.BookServiceImpl;

public class App {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        BookServiceImpl bsi = new BookServiceImpl();
        Book book1 = new Book(37, "test222", "book");
        //bookService.persist(book1);
        //List<Book> books1 = bookService.findAll();
        bsi.addBook(book1);
        List<Book> books1 = bsi.getAll();
        System.out.println("Books Persisted are :");
        for (Book b : books1) {
            System.out.println("-" + b.toString());
        }
    }
}
