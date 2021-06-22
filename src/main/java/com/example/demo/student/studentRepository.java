package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//ATTENTION, C'EST UNE INTERFACE
public interface studentRepository extends JpaRepository<Student, Long> {

}
