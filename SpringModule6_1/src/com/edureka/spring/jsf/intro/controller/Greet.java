package com.edureka.spring.jsf.intro.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Greet {
    
    private String greetings="Congratulation , you have successfully built your first JSF Application";
	
    public String getGreetings() {
        return greetings;
    }
}



