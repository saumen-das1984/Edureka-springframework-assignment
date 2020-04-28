package com.edureka.spring.security.intro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();		
		model.setViewName("landingPage");
		return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Incorrect username and password!");
		}	
		model.setViewName("login");
		return model;

	}

	
}
