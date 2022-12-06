package com.example.studentAppNew_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String admNo;
    private int rollNo;
    private String college;

    public student() {
    }

    public student(int id, String name, String admNo, int rollNo, String college) {
        this.id = id;
        this.name = name;
        this.admNo = admNo;
        this.rollNo = rollNo;
        this.college = college;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdmNo() {
        return admNo;
    }

    public void setAdmNo(String admNo) {
        this.admNo = admNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
