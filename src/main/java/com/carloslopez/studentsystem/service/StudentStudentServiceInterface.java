package com.carloslopez.studentsystem.service;

import com.carloslopez.studentsystem.model.Student;
import com.carloslopez.studentsystem.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentStudentServiceInterface implements StudentServiceInterface {
    /*This will inject the studentRepo into our studentService class so we can use it*/
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {

        return studentRepo.save(student);
    }
}
