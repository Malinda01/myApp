package com.app.controller;

import com.app.entity.Student;
import com.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Mapping for select all the students
    @GetMapping(path = "/students")
    public List<Student> getStudents(){

        return studentService.getStudent();
    }

    //Mapping for select students by ID
    @GetMapping(path = "/students/{id}")
    public Student getStudentById(@PathVariable int id) {

        return studentService.getStudentByID(id);
    }
}
