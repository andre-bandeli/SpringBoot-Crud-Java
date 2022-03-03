package com.br.memorize.memorize.repository;

import com.br.memorize.memorize.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {


    Card findByName(String name);
}
