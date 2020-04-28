package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTestSetterDI {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextSetterDI.xml");
		
		User user = context.getBean("user", User.class);
		Assertions.assertThat(user).isNotNull();
		
		System.out.println("Car Name : "+user.getCar().getName()+"\t Car Making Year : "+user.getCar().getMakeYear());
	}

}
