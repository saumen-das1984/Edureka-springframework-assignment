package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextBeanLifeCycleAnnotation.xml");
		
		Hello hello = context.getBean("hello", Hello.class);
		Assertions.assertThat(hello).isNotNull();
		
		hello.showMessage();
		
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
