package com.BikkadIT.StudentManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BikkadIT.StudentManagement.model.Student;



@Service
public interface StudentServiceI {
	
	public void saveAllStudent(List <Student> list);
	
	public Student getDetailsByrollno(int rollno);
	
	public List<Student> getDetailsByName(String name);
	
	public List<Student> getDetailsByAddress(String address);
	
	public Student getDetailsByEmail(String email);
	
	public List<Student> getDetailsByAge(int age);

}
