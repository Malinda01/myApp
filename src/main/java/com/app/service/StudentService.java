package com.app.service;

import com.app.entity.Student;
import com.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //should be placed exactly here
public class StudentService {

    @Autowired //Dependency Injection
    private StudentRepository studentRepository; //Interface type reference variable

    //method
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }
}
