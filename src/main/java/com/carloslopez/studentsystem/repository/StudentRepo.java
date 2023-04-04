package com.carloslopez.studentsystem.repository;


import com.carloslopez.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*Spring boot automatically will connect to our mySql database -- and create a student table*/
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {


}
