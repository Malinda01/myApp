package com.app.repository;

import com.app.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    //This line is updated for deletion
    Optional<Student> deleteById(int id);
}
