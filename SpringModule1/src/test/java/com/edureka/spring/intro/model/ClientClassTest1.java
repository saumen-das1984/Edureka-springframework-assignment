package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientClassTest1 {

//	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextBean.xml");
		
//		ClientClass client = context.getBean("clientBean", ClientClass.class);
//		Assertions.assertThat(client).isNotNull();
		
		}

}
