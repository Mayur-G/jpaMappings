package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_student11")
public class StudentOneToOne {
	
	@Id
	private int studentId;
	private String studentName;
	private String about;
	
	@OneToOne(mappedBy = "studentOneToOne",cascade = CascadeType.ALL)
	private LaptopOneToOne laptopOneToOne;

	public StudentOneToOne(int studentId, String studentName, String about, LaptopOneToOne laptopOneToOne) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.about = about;
		this.laptopOneToOne = laptopOneToOne;
	}

	public StudentOneToOne() {
		// TODO Auto-generated constructor stub
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public LaptopOneToOne getLaptopOneToOne() {
		return laptopOneToOne;
	}

	public void setLaptopOneToOne(LaptopOneToOne laptopOneToOne) {
		this.laptopOneToOne = laptopOneToOne;
	}
	
	
}
