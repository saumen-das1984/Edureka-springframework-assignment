package com.edureka.spring.intro.model;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("If Exception occurs this method will execute first");
	}
}
