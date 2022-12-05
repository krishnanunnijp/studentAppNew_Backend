package com.example.studentAppNew_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @GetMapping("/")
    public String Homepage() {
        return "welcome to my home page";
    }
}
