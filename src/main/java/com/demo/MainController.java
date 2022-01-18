package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController{

	@GetMapping("/")
	public String viewHome()
	{
		return "home";
	}


}
