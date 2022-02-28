package com.br.memorize.memorize.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controler {

    @GetMapping("/")
    public String homePage() {
        return "home.html";
    }

}
