package com.BikkadIT.StudentManagement.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.StudentManagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable>{

	// This is the Our Custom Methods
	public Student findByRollno(int rollno);
	
	public List<Student> findByName(String name);
	
	public List<Student> findByAddress(String address);
	
	public Student findByEmail(String email);
	
	public List<Student> findByAge(int age);
	
}
