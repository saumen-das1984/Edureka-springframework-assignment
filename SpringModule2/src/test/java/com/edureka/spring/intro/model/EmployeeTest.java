package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextResourceAnnotation.xml");
		 
        Employee employee = context.getBean("myemployee", Employee.class);
        Assertions.assertThat(employee).isNotNull();
        
        System.out.println(employee.toString());
	}

}
