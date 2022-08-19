package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("student")
public class StudentRestController {

    private final StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
