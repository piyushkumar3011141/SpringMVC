package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String greet(@RequestParam(name = "user" , defaultValue = "Guestuser") String user , Model model) {
		
		model.addAttribute("user", user);
		return "electronic";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/path/{id}")
	public String pathVariablle(@PathVariable(name = "id") int id) {
		System.out.println("UserController.pathVariablle : "+id);
		return "electronic";
	}
	
	
	@PostMapping("/login")
	public String userLogin(@RequestParam(name = "username") String username , @RequestParam(name = "password") String password , Model model) {
		
		System.out.println("UserController.userLogin : "+username);
		System.out.println("UserController.userLogin : "+password);
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		
		return "profile";
	}
	
	
	

}
