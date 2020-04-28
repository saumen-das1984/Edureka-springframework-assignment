package com.edureka.spring.intro.model;

public class Authenticate {
	public boolean authenticate(String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("Password is too short");
		} else {
			return true;
		}
	}

}
