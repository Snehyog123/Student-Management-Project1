package com.BikkadIT.StudentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.StudentManagement.model.Student;
import com.BikkadIT.StudentManagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {
    @Autowired
	private StudentRepository studentRepository; 
	
	@Override
	public void saveAllStudent(List<Student> list) {
		studentRepository.saveAll(list);
		
	}

	@Override
	public Student getDetailsByrollno(int rollno) {
	Student findByRollno = studentRepository.findByRollno(rollno);
		return findByRollno;
	}

	@Override
	public List<Student> getDetailsByName(String name) {
		List<Student> findByName = studentRepository.findByName(name);
		return findByName;
	}

	@Override
	public List<Student> getDetailsByAddress(String address) {
		List<Student> findByAddress = studentRepository.findByAddress(address);
		return findByAddress;
	}

	@Override
	public Student getDetailsByEmail(String email) {
		Student findByEmail = studentRepository.findByEmail(email);
		return findByEmail;
	}

	@Override
	public List<Student> getDetailsByAge(int age) {
		List<Student> findByAge = studentRepository.findByAge(age);
		return findByAge;
	}
	

}
