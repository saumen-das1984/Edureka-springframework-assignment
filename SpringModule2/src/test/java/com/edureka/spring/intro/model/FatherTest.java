package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FatherTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextBeanInheritance.xml");
		
		Father child = context.getBean("child", Father.class);
		Assertions.assertThat(child).isNotNull();
		
		System.out.println("Child Name : "+child.getName()+"\t Child Sur Name : "+child.getSurName());
	}

}
