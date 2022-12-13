package com.BikkadIT.StudentManagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.StudentManagement.model.Student;
import com.BikkadIT.StudentManagement.service.StudentServiceImpl;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StudentManagementApplication.class, args);
		 
		   StudentServiceImpl bean = context.getBean(StudentServiceImpl.class);
		   
//		   Student stu=new Student();
//		   stu.setName("suyog");
//		   stu.setEmail("suyogshirsath11@gmail.com");
//		   stu.setAddress("aurangabad");
//		   stu.setAge(30);
//		   
//		   Student stu1=new Student();
//		   stu1.setName("snehal");
//		   stu1.setEmail("snehalshirsath47@gmail.com");
//		   stu1.setAddress("parbhani");
//		   stu1.setAge(28);
		   
//		   Student stu2=new Student();
//		   stu2.setName("snehyog");
//		   stu2.setEmail("snehyog12@gmail.com");
//		   stu2.setAddress("pune");
//		   stu2.setAge(20);
//		   
//		   Student stu3=new Student();
//		   stu3.setName("akash");
//		   stu3.setEmail("akashmagar51@gmail.com");
//		   stu3.setAddress("aurangabad");
//		   stu3.setAge(26);
//		   
//		   Student stu4=new Student();
//		   stu4.setName("suresh");
//		   stu4.setEmail("shindesuresh@gmail.com");
//		   stu4.setAddress("aurangabad");
//		   stu4.setAge(38);
//		   
//		   List<Student> list=new ArrayList();
//		   list.add(stu);
//		   list.add(stu1);
//		   list.add(stu2);
//		   list.add(stu3);
//		   list.add(stu4);
//		   
//		   bean.saveAllStudent(list);
		   
//		   Student detailsByrollno = bean.getDetailsByrollno(2);
//		   System.out.println(detailsByrollno);
//	
		
//		   List<Student> detailsByName = bean.getDetailsByName("suyog");
//		   System.out.println(detailsByName);
		
//		   List<Student> detailsByAddress = bean.getDetailsByAddress("PUNE");
//		   System.out.println(detailsByAddress);
		   
//		   Student detailsByEmail = bean.getDetailsByEmail("suyogshirsath11@gmail.com");
//		   System.out.println(detailsByEmail);
		   
		   List<Student> detailsByAge = bean.getDetailsByAge(28);
		   System.out.println(detailsByAge);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
