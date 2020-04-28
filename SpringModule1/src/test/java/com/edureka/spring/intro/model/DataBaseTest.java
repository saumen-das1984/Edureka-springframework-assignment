package com.edureka.spring.intro.model;

import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataBaseTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextCollection.xml");
		
		DataBase db = context.getBean("database", DataBase.class);
		Assertions.assertThat(db).isNotNull();
		
		System.out.println("Databases Name : "+db.getDbNameList());
	}

}
