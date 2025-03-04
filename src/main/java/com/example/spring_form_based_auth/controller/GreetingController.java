package com.example.spring_form_based_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/welcone")
    public String welcome() {
        return "welcome.html";
    }

    @GetMapping("/login")
    public String logIn() {
        return "login.html";
    }
}
