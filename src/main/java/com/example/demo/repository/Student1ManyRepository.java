package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.StudentOneToMany;

public interface Student1ManyRepository  extends JpaRepository<StudentOneToMany, Integer>{

	@Query(value = "select city from address where street = 'hinkal'",nativeQuery = true)
	public String getName();
	
	@Query(value = "select city from address",nativeQuery = true)
	public List<String> getCity();
}
