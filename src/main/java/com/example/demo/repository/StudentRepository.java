package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.StudentOneToOne;

public interface StudentRepository extends JpaRepository<StudentOneToOne, Integer>{

}
