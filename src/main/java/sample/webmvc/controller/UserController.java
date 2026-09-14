package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/electronic")
public class UserController {
	
	
	@RequestMapping("/")
	public String greet() {
		return "electronic";
	}
	
	@RequestMapping(value = {"/movies" , "/films"})
	public String movies() { 
		return "movies";
	}

}
