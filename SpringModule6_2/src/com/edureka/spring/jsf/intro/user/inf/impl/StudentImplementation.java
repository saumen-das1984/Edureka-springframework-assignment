package com.edureka.spring.jsf.intro.user.inf.impl;

import javax.inject.Named;

import com.edureka.spring.jsf.intro.user.inf.Student;

@Named
public class StudentImplementation implements Student{
 
	public String getMessage() {
		
		return "This is a concrete Student";
	
	}
	
 
}