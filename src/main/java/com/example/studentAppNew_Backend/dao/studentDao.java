package com.example.studentAppNew_Backend.dao;

import com.example.studentAppNew_Backend.model.student;
import org.springframework.data.repository.CrudRepository;

public interface studentDao extends CrudRepository<student,Integer> {
}
