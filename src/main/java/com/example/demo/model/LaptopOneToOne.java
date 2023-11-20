package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_laptop11")
public class LaptopOneToOne {
		
	@Id
	private int laptopId;
	private String modelNumber;
	private String brand;
		
	@OneToOne
	@JoinColumn(name="student_id")
	private StudentOneToOne studentOneToOne;

	public LaptopOneToOne(int laptopId, String modelNumber, String brand, StudentOneToOne studentOneToOne) {
		super();
		this.laptopId = laptopId;
		this.modelNumber = modelNumber;
		this.brand = brand;
		this.studentOneToOne = studentOneToOne;
	}
	
	public LaptopOneToOne() {
		// TODO Auto-generated constructor stub
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public StudentOneToOne getStudentOneToOne() {
		return studentOneToOne;
	}

	public void setStudentOneToOne(StudentOneToOne studentOneToOne) {
		this.studentOneToOne = studentOneToOne;
	}
	
	
}

