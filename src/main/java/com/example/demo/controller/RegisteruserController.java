package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Users;
import com.example.demo.form.RegisterForm;
import com.example.demo.repository.RegisterRepository;

@Controller
public class RegisteruserController {
	
	
	

	@Autowired
	private RegisterRepository register;
	
	/**
	 * 会員新規登録をする.
	 * 
	 * @param registerform
	 * @return
	 */
	@RequestMapping("/register")
	public String rergister(RegisterForm registerform) {
		Users user = new Users();
		user.setName(registerform.getName());
		user.setEmail(registerform.getEmail());
		user.setPassword(hashPassword(registerform.getPassword()));
		register.UserRegister(user);
		return "index";
	}
	
	
	/**
	 * パスワードハッシュ化のメソッド
	 * メソッドの書き方忘れかけてたので、練習用
	 * @param password
	 * @return ハッシュ化されたパスワード
	 */
	public String hashPassword(String password) {
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String pass = bcrypt.encode(password);
		return pass;
	}
	
}
