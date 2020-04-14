package com.restaurant.pizzeria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizzeria")
public class MainController {

    @GetMapping(value = "/main")
    public String greet() {
        return "Welcome!";
    }
}
