package com.example.demo;

import org.hibernate.Session;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

//@org.hibernate.annotations.Entity // mozna @DynamicUpdate zamiast tego
@Entity
public class StudentEntity {
    @javax.persistence.Id
    @GeneratedValue
    private Long id;
    private String name;
    private String passportNumber;

    public StudentEntity(Long id, String name, String passportNumber) {
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;


    }

    public static void main(String[] args) {

    }


}
