package com.edureka.spring.intro.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edureka.spring.jdbc.intro.bean.Course;
import com.edureka.spring.jdbc.intro.dao.impl.CourseDAOImpl;

public class JDBCTestClass {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextMYSQLJDBCTemplate.xml");
		CourseDAOImpl courseDAOImpl=(CourseDAOImpl)context.getBean("courseDAOImpl");	
		Course course=new Course("Microservices","Microservices Architechture Certification",25000);
		boolean deleteFlag = courseDAOImpl.deleteCourse(course);
		System.out.println("deleteFlag :"+deleteFlag);
		if(deleteFlag)
			System.out.println("Course deleted successfully");
		else
			System.out.println("Error in deletion");
		course=new Course("SpringFramework","Spring Framework Certification",25000);
		boolean insertFlag = courseDAOImpl.insertCourse(course);
		System.out.println("insertFlag :"+insertFlag);
		if(insertFlag)
			System.out.println("Course inserted successfully");
		else
			System.out.println("Error in insertion");
		
		String courseTitle = "SpringFramework";
		List<Course> courseList=courseDAOImpl.findByCourseTitle(courseTitle);
		if(courseList.size()>0)
		{
			System.out.println("Course found successfully");
			for (Course unitCourse : courseList) 
			System.out.println("unitCourse :"+unitCourse);
		}
		else
		{
			System.out.println("Error in insertion");
		}
		
		course=new Course("SpringFramework","Spring Framework Certification",25000);
		String newCourseName="SpringBasic";
		boolean updateFlag = courseDAOImpl.updateCourse(newCourseName,course);
		System.out.println("updateFlag :"+deleteFlag);
		if(updateFlag)
			System.out.println("Course updated successfully");
		else
			System.out.println("Error in updation");
	}

}
