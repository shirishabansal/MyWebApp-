package com.shirisha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//can keep any method name
	@GetMapping("home")
	public void home(Model model)
	{
		model.addAttribute("message", "This is the First Spring Web Application by me");
	}

}
