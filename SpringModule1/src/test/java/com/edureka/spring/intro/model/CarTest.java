package com.edureka.spring.intro.model;


import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		User user = context.getBean("user", User.class);
		Car car = context.getBean("car", Car.class);
		
		Assertions.assertThat(user).isNotNull();
		Assertions.assertThat(car).isNotNull();
		
		Assertions.assertThat(user.getCar()).isEqualTo(car);
	}

}
