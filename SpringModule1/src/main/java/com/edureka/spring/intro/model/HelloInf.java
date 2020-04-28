package com.edureka.spring.intro.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloInf implements InitializingBean, DisposableBean{
	public void destroy() {
		System.out.println("Destroy Method Called");
	}
	
	public void showMessage() {
		System.out.println("Welcome to Edureka!!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean Initialization");
		
	}
}
