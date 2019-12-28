package com.school.demo.controller;

import com.school.demo.StudentService;
import com.school.demo.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping(value = "/addStudent",consumes = "application/json")
    public String postStudentInfo(@RequestBody Student student){
        return service.addStudent(student);
    }

    @GetMapping(value = "/getStudent/{studentName}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Student> getStudentInfo(@PathVariable("studentName") String name)
    {
        return service.getStudent(name);
    }


}
