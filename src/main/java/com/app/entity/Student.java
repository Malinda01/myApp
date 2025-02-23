package com.app.entity;

//Supposed to rep the DB table (ORM)

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

//An entity
@Entity

//Represent the student table
@Table(name = "student")
public class Student {

    @Id //Represent the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto generated primary key
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
