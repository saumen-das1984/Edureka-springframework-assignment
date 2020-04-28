package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotationTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextRequiredAnnotation.xml");
		RequiredAnnotation reqAnnot = (RequiredAnnotation) context.getBean("reqAnnotation");
		Assertions.assertThat(reqAnnot).isNotNull();

		System.out.println("Value : " + reqAnnot.getValue());

	}

}
