package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kitchen")
public class UserController2 {
	
	
	@RequestMapping("/")
	public String greet() {
		return "kitchen";
	}
	
	@RequestMapping(value = {"/movies" , "/films"})
	public String movies() { 
		return "movies";
	}

}
