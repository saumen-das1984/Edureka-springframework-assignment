package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AuthenticateTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextThrowsAdvice.xml");
		
		Authenticate authenticate = (Authenticate) context.getBean("proxy");
		Assertions.assertThat(authenticate).isNotNull();
		
		try {
			authenticate.authenticate("1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
