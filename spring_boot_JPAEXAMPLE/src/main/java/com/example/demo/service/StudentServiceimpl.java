package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceimpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllData() {
		// TODO Auto-generated method stub
//		List<Student> students = new ArrayList<Student>();
//		
//
//		Student student = new Student();
//		student.setId(1);
//		student.setName("Hiral Khaniya");
//		student.setEmail("testing@gmail.com");
//		student.setCity("jamnagr");
//		student.setCollege_name("VGEC");
//		student.setDepartment("Computer");
//		student.setPhoneno("9904114483");
//		student.setState("Gujarat");
//
//		Student student1 = new Student();
//		student1.setId(3);
//		student1.setName("vidhi");
//		student1.setEmail("testing2@gmail.com");
//		student1.setCity("jamnagr");
//		student1.setCollege_name("MP  SHAH");
//		student1.setDepartment("Computer");
//		student1.setPhoneno("9904114483");
//		student1.setState("Gujarat");
//
//
//		students.add(student);
//		students.add(student1);
//
//		return students;
		return studentRepository.findAll();
	}

	

	@Override
	public Student getStudent() {
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("hy");
		student1.setEmail("testing2@gmail.com");
		return student1;
	}

}
