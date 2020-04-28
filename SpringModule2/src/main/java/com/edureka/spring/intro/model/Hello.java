package com.edureka.spring.intro.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Hello {
	@PostConstruct
	public void afterInitialization() {
		System.out.println("Bean Initialization");
	}
	
	@PreDestroy
	public void beforeDestruction() {
		System.out.println("Destroy Method Called");
	}
	
	public void showMessage() {
		System.out.println("Welcome to Edureka!!!");
	}
}
