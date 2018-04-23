package com.javacodegeeks.snippets.enterprise.hibernate.service.impl;

import com.javacodegeeks.snippets.enterprise.hibernate.dao.reposytories.CardRepository;
import com.javacodegeeks.snippets.enterprise.hibernate.model.Card;
import com.javacodegeeks.snippets.enterprise.hibernate.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService{

    @Autowired
    private CardRepository cardRepository;

    @Override
    public Card addCard(Card card) {
        Card saveCard = cardRepository.saveAndFlush(card);

        return saveCard;
    }

    @Override
    public void delete(long id){
        cardRepository.deleteById(id);
    }


    @Override
    public Card getByClientId(String clientId){
        return cardRepository.findByClientId(clientId);
    }

    @Override
    public Card getByBookId(String bookId){
        return cardRepository.findByBookId(bookId);
    }

    @Override
    public Card editCard(Card card) {
        return cardRepository.saveAndFlush(card);
    }

    @Override
    public List<Card> getAll() {
        return cardRepository.findAll();
    }
}
