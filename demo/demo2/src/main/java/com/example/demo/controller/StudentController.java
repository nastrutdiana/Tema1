package com.example.demo.controller;



import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;



    @GetMapping
    public String getStudents(Model model){
        model.addAttribute("students", studentService.getStudents());
        return "ex";
    }
}
