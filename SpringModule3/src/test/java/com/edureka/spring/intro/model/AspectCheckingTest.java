package com.edureka.spring.intro.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectCheckingTest {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextAspectJ.xml");
		SampleBean obj = (SampleBean) context.getBean("sampleBean");
		obj.actualLogicMethod();

	}

}
