package com.edureka.spring.intro.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Parent {
	private Child child;

	public Child getChild() {
		return child;
	}

	@Autowired
	public void setChild(Child child) {
		this.child = child;
	}

	public void showMessage() {
		System.out.println("Parent Class Method");
		child.showMessage();
	}

}
