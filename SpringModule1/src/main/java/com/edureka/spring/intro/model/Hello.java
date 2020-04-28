package com.edureka.spring.intro.model;

public class Hello {
	public void init() {
		System.out.println("Bean Initialization");
	}
	
	public void destroy() {
		System.out.println("Destroy Method Called");
	}
	
	public void showMessage() {
		System.out.println("Welcome to Edureka!!!");
	}
}
