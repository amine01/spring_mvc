package com.essamine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class ControllerOne {

	@RequestMapping(method = RequestMethod.GET)
	public String welcomePage() {
		System.out.println("Welcome Page");
		return "welcome";
	}

}
