package com.example.studentAppNew_Backend.dao;

import com.example.studentAppNew_Backend.model.student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface studentDao extends CrudRepository<student,Integer> {


    @Query(value = "SELECT `id`, `adm_no`, `college`, `name`, `roll_no` FROM `student` WHERE `name`=:name",nativeQuery = true)
    List<student> SearchStudents(@Param("name") String name);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `student` WHERE `id` =:id",nativeQuery = true)
    void deleteStudent(@Param("id") Integer id);
}
