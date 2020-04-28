package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloInfTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextBeanLifeCycleInf.xml");
		
		HelloInf helloInf = context.getBean("helloInf", HelloInf.class);
		Assertions.assertThat(helloInf).isNotNull();
		
		helloInf.showMessage();
		
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
