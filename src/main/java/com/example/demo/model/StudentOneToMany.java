package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_student1Many")
public class StudentOneToMany {

	@Id
	private int studentId;
	private String studentName;
	private String about;
	
	@OneToMany(mappedBy = "studentOneToMany",cascade = CascadeType.ALL)
	private List<Address> address = new ArrayList<>();

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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public StudentOneToMany(int studentId, String studentName, String about, List<Address> address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.about = about;
		this.address = address;
	}
	
	public StudentOneToMany() {
		// TODO Auto-generated constructor stub
	}
}
