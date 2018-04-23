package com.javacodegeeks.snippets.enterprise.hibernate.service;

import com.javacodegeeks.snippets.enterprise.hibernate.model.Card;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CardService {

    Card addCard(Card card);

    void delete(long id);

    Card getByClientId(String clientId);

    Card getByBookId(String bookId);

    Card editCard(Card card);

    List<Card> getAll();
}
