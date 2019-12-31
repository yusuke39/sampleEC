package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Users;
import com.example.demo.form.RegisterForm;
import com.example.demo.repository.RegisterRepository;

@Controller
public class RegisteruserController {

	@Autowired
	private RegisterRepository register;
	
	@RequestMapping("/register")
	public String rergister(RegisterForm registerform) {
		Users user = new Users();
		user.setName(registerform.getName());
		user.setEmail(registerform.getEmail());
		user.setPassword(registerform.getPassword());
		System.out.println(user);
		register.UserRegister(user);
		return "index";
	}
	
}
