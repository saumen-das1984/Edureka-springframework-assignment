package com.edureka.spring.intro.model;

import lombok.Data;

@Data
public class ClientClass {
	TargetClass targetClass;
	public void showMessage() {
		System.out.println("Client Class");
	}
}
