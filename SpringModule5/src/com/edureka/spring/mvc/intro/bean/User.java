package com.edureka.spring.mvc.intro.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@NotNull
	@Size(min=5,max=50)
	private String username;
	
	@NotNull
	@Size(min=5,max=30)
	private String password;

//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	
//	public User(){}
//
//	public User(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}
}
