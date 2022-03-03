package com.br.memorize.memorize;


import com.br.memorize.memorize.model.Card;
import com.br.memorize.memorize.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class PrincipalController {

    @Autowired
    private CardService service;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("adm/index");
    }

    @PostMapping("/add")
    public Card saveCard(@RequestBody Card card) {
        return service.saveCard(card);
    }

    @PostMapping("/addList")
    public List<Card> saveCardList(@RequestBody List <Card>  cardList) {
        return service.saveCardList(cardList);
    }

    @GetMapping("/list")
    public  List<Card> getCardList() {
        return service.getCardList();
    }

    @GetMapping("cardId/{id}")
    public Card getCardById(@PathVariable int id) {
        return service.getCardById(id);
    }

    @GetMapping("/cardName/{nome}")
    public Card getCardByName(@PathVariable String nome) {
        return service.getCardByName(nome);
    }

    @GetMapping
    public String deleteCardById(@PathVariable int id) {
        return service.deleteCardById(id);
    }

    @PutMapping("/update")
    public Card updateCard(@RequestBody Card card) {
        return service.saveCard(card);
    }

}
