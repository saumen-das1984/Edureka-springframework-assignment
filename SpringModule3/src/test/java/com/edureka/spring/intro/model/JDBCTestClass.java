package com.edureka.spring.intro.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.spring.jdbc.intro.Course;
import com.edureka.spring.jdbc.intro.dao.impl.CourseDAOImpl;

public class JDBCTestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextMYSQLJDBC.xml");
		CourseDAOImpl courseDAOImpl=(CourseDAOImpl)context.getBean("courseDAOImpl");	
		Course course=new Course("Microservices","Microservices Architechture Certification",25000);
		courseDAOImpl.insertCourse(course);
		
		
	}
	
}
