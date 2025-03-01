package com.app.entity;

//Changed !!!
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id // Represents the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generated primary key
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
