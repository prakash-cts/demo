package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class DemoController {
    @Autowired
    StudentRepository repository;

    @GetMapping
    public String getStudent(){
        save();
        List<Student> s = repository.findAll();
        return "Hello"+ s.toString();
    }
    private void save(){
        Student s = new Student("prakash");
        repository.save(s);
    }
}
