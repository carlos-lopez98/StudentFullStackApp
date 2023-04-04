package com.carloslopez.studentsystem.controller;

import com.carloslopez.studentsystem.model.Student;
import com.carloslopez.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add (@RequestBody Student student){
            studentService.saveStudent(student);
            return "New Student is Added";
    }

}
