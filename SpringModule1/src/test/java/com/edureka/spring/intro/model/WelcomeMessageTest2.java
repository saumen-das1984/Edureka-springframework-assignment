package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WelcomeMessageTest2 {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextBeanScopePrototype.xml");
		
		WelcomeMessage welcomeMsg = context.getBean("welcomeMsg", WelcomeMessage.class);
		Assertions.assertThat(welcomeMsg).isNotNull();
		
		welcomeMsg.setMessage("Welcome to Edureka");
		System.out.println(welcomeMsg.getMessage());
		welcomeMsg = context.getBean("welcomeMsg", WelcomeMessage.class);
		System.out.println(welcomeMsg.getMessage());
	}

}
