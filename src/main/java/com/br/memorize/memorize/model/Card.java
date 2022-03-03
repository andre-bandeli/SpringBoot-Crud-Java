package com.br.memorize.memorize.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "card")
public class Card {


    public Card() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private Date data;
    private String name;
    private String texto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData(Date date) {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
