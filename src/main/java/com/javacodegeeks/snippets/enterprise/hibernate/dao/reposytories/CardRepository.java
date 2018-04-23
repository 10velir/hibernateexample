package com.javacodegeeks.snippets.enterprise.hibernate.dao.reposytories;

import com.javacodegeeks.snippets.enterprise.hibernate.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CardRepository extends JpaRepository<Card, Long> {

    @Query("select b from Card b where b.clientId = :clientId")
    Card findByClientId(@Param("clientId") String clientId);

    @Query("select b from Card b where b.bookId = :bookId")
    Card findByBookId(@Param("bookId") String bookId);
}
