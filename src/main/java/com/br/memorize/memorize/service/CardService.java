package com.br.memorize.memorize.service;


import com.br.memorize.memorize.model.Card;
import com.br.memorize.memorize.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;

    public Card saveCard(Card card) {
       return repository.save(card);
    }

    public List <Card>  saveCardList(List <Card>  cardList) {
        return repository.saveAll(cardList);
    }

    public  List<Card> getCardList() {
        return repository.findAll();
    }

    public Card getCardById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Card getCardByName(String nome) {
        return repository.findByName(nome);
    }

    public String deleteCardById(int id) {
        repository.deleteById(id);
        return "card removido!!" + id;
    }

    public Card updateCard(Card card) {
        Card existCard = repository.findById(card.getId()).orElse(null);
        existCard.setData(card.getData(new Date()));
        existCard.setNome(card.getNome());
        existCard.setTexto(card.getTexto());

        return repository.save(existCard);
    }

}
