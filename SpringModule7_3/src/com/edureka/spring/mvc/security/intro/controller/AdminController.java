package com.edureka.spring.mvc.security.intro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AdminController {
	
	@RequestMapping("addAdmin")
	public String addAdmin(){
		return "addAdmin";
	}

}
