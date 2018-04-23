package com.javacodegeeks.snippets.enterprise.hibernate.dao.reposytories;

import com.javacodegeeks.snippets.enterprise.hibernate.model.Card;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javacodegeeks.snippets.enterprise.hibernate.model.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long> {

     @Query("select b from Book b where b.title = :title")
     Book findByTitle(@Param("title") String title);

     @Query("select b from Book b where b.author = :author")
     Book findByAuthor(@Param("author") String author);

}
