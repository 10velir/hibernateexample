package com.javacodegeeks.snippets.enterprise.hibernate.service;

import com.javacodegeeks.snippets.enterprise.hibernate.model.Book;
import com.javacodegeeks.snippets.enterprise.hibernate.model.Client;

import java.util.List;

public interface BookServiceOnJpa {

    void delete(long id);

    Book findByTitle(String title);

    Book findByAuthor(String author);

    List<Book> getAll();

    Book addBook(Book book);

    Book editBook(Book book);

}
