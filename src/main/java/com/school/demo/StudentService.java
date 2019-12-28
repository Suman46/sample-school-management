package com.school.demo;


import com.school.demo.domain.Student;
import com.school.demo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Slf4j
public class StudentService {

    @Autowired
    StudentRepository repository;


    public String addStudent(Student student){
        System.out.println(student.toString());
        repository.save(student);
        return "Student Added Successfully!";
    }

    public Optional<Student> getStudent(String name){
        return repository.findByName(name);
    }

}
