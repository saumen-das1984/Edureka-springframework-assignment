package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ParentTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContextBeanAutowired.xml");
		Parent parent=(Parent)context.getBean("parent");
		parent.showMessage();
		parent.getChild().showMessage();
	}

}
