package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.User;
import com.app.pojos.UserRole;
import com.app.service.IUserService;

@Controller
public class HomeController {

	@Autowired
	private IUserService service;

	@GetMapping("/")
	public String loginPage() {
		return "/login";
	}

	@PostMapping("/")
	public String login(@RequestParam String name, @RequestParam String pass, ModelMap map) {
		System.out.println("1.In Post Mapping of Home");
		String mesg = "";
		try {
		User user = service.validateUser(name, pass);
		System.out.println("2.In Post Mapping of Home");
		map.addAttribute("UserDetl", user);
		System.out.println("3.In Post Mapping of Home");
		if (user.getRole()==UserRole.ADMIN) {
			mesg = "Login Successful as Admin";
			map.addAttribute("mesg",mesg);
			return "/admin/welcome";
			
		}
		else {
			return "/user/welcome";
		}
	} catch (Exception e) {
			mesg = "Invalid Credentials";
			map.addAttribute("mesg",mesg);
			return "/login";
		}

	}
}
