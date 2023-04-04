package com.carloslopez.studentsystem.controller;

import com.carloslopez.studentsystem.model.Student;
import com.carloslopez.studentsystem.service.StudentStudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpResponse;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentStudentServiceInterface studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
            studentService.saveStudent(student);
            System.out.println("Received");
            return "New Student is Added";
    }

}
