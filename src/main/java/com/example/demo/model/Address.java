package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	private int addressId;
	private String street;
	private String city;
	private String country;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private StudentOneToMany studentOneToMany;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(int addressId, String street, String city, String country) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public StudentOneToMany getStudentOneToMany() {
		return studentOneToMany;
	}

	public void setStudentOneToMany(StudentOneToMany studentOneToMany) {
		this.studentOneToMany = studentOneToMany;
	}
	
	
}
