package com.javacodegeeks.snippets.enterprise.hibernate.service.impl;

import com.javacodegeeks.snippets.enterprise.hibernate.dao.reposytories.BookRepository;
import com.javacodegeeks.snippets.enterprise.hibernate.model.Book;
import com.javacodegeeks.snippets.enterprise.hibernate.service.BookServiceOnJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("JpaBookServise")

public class BookServiceImpl implements BookServiceOnJpa {

    @Autowired
    private BookRepository bookRepository;

    /*@Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }*/

    @Autowired
    public void set(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        Book book2 =  bookRepository.save(book);
        return book2;
    }

    @Override
    public void delete(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Book findByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book editBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }


}