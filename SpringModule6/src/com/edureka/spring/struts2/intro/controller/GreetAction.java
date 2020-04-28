package com.edureka.spring.struts2.intro.controller;

import lombok.Data;

@Data
public class GreetAction{

	private String username;

	public String execute() {

		return "SUCCESS";

	}
}