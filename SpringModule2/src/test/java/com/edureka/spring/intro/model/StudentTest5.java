package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest5 {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextSpEL1.xml");
		
		Student student = context.getBean("student", Student.class);
		Assertions.assertThat(student).isNotNull();
		
		System.out.println("Student Name : "+student.getName()+"\t Id : "+student.getId());
		System.out.println("Hostel Name : "+student.getHostel().getHostelName()+"\t Current City : "+student.getCurrentCity());
	}

}
