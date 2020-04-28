package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest3 {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextValueAnnotation.xml");
		
		Student student1 = context.getBean("student1", Student.class);
		Assertions.assertThat(student1).isNotNull();
		
		System.out.println("Student1 Name : "+student1.getName()+"\t Id : "+student1.getId());
		
		Student student2 = context.getBean("student2", Student.class);
		Assertions.assertThat(student2).isNotNull();
		
		System.out.println("Student2 Name : "+student2.getName()+"\t Id : "+student2.getId());
	}

}
