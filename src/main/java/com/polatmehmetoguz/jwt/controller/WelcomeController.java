package com.polatmehmetoguz.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {

    @GetMapping(path = "/getMsg")
    public String welcome(){
        return "Spring security active Oguz";
    }
}

