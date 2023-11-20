package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Address;
import com.example.demo.model.LaptopOneToOne;
import com.example.demo.model.StudentOneToMany;
import com.example.demo.model.StudentOneToOne;
import com.example.demo.repository.Student1ManyRepository;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class JpaMappingsApplication implements CommandLineRunner{

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	Student1ManyRepository student1ManyRepository;
	
	private Logger logger = LoggerFactory.getLogger(JpaMappingsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JpaMappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		StudentOneToOne studentOneToOne = new StudentOneToOne();
//		studentOneToOne.setStudentId(15);
//		studentOneToOne.setStudentName("Mike");
//		studentOneToOne.setAbout("Prod");
//		
//		LaptopOneToOne laptopOneToOne = new LaptopOneToOne();
//		laptopOneToOne.setBrand("Oppo");
//		laptopOneToOne.setModelNumber("117oppo");
//		laptopOneToOne.setLaptopId(222);
//		laptopOneToOne.setStudentOneToOne(studentOneToOne);
//		
//		studentOneToOne.setLaptopOneToOne(laptopOneToOne);
//		
//	//	StudentOneToOne student	 =  studentRepository.save(studentOneToOne);
//		StudentOneToOne student = studentRepository.findById(13).get();
//		
//		logger.info("Name is {},{}",student.getStudentName(),student.getAbout());
		
		
//		StudentOneToMany studentOneToMany = new StudentOneToMany();
//		studentOneToMany.setStudentId(13);
//		studentOneToMany.setStudentName("Mayur");
//		studentOneToMany.setAbout("developer");
//		
//		
//		Address a1 = new Address();
//		a1.setAddressId(111);
//		a1.setCity("Mysore");
//		a1.setStreet("hinkal");
//		a1.setCountry("India");
//		a1.setStudentOneToMany(studentOneToMany);
//		
//		Address a2 = new Address();
//		a2.setAddressId(222);
//		a2.setCity("Bangalore");
//		a2.setStreet("whitefiled");
//		a2.setCountry("Kenya");
//		a2.setStudentOneToMany(studentOneToMany);
//		
//		List<Address> address = new ArrayList<>();
//		address.add(a1);
//		address.add(a2);
//		
//		studentOneToMany.setAddress(address);
//		
//		student1ManyRepository.save(studentOneToMany);
		
		String repository = student1ManyRepository.getName();
		logger.info("Name is is {}",repository);
		
		List<String> repository1 = student1ManyRepository.getCity();
		logger.info("City is is {}",repository1);
	}

}
