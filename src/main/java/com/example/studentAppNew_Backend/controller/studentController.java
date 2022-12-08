package com.example.studentAppNew_Backend.controller;

import com.example.studentAppNew_Backend.dao.studentDao;
import com.example.studentAppNew_Backend.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

@RestController
public class studentController {

    @Autowired
    studentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> add(@RequestBody student s) {
        HashMap<String, String> map = new HashMap<>();
        dao.save((s));
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping(path = "/view")
    public List<student> view(){
        return (List<student>) dao.findAll();
    }
}
