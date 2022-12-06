package com.example.studentAppNew_Backend.controller;

import com.example.studentAppNew_Backend.model.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class studentController {

    @GetMapping("/")
    public String Homepage() {
        return "welcome to my home page";
    }
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody student s) {
        System.out.println(s.toString());
        return "added successfully";
    }
}
