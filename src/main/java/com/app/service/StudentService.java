package com.app.service;

import com.app.entity.Student;
import com.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //should be placed exactly here
public class StudentService {

    @Autowired //Dependency Injection
    private StudentRepository studentRepository; //Interface type reference variable

    //method - find all the students
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    //method - find the student from the ID
    public Student getStudentByID(int id){
        Optional<Student> stu =
                studentRepository.findById(id);
        if(stu.isPresent()){
            return stu.get();
        }

        return null;
    }

    //method - create a student record
    public Student createStudent (Student student){
        return studentRepository.save(student);
    }

    //method - delete students by ID
    public Student deleteStudentByID (int id){
        Optional<Student> stu = studentRepository.deleteById(id);
        if(stu.isPresent()){
            return stu.get();
        }

        return null;
    }

    //method - update student

}
