package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Mapper.RegisterUserMapper;
import com.example.demo.domain.Users;

@Service
public class RegisterUserService {
	
	@Autowired
	private RegisterUserMapper registerUserMapper;
	
	@Transactional
	public void insertUser(Users user) {
		registerUserMapper.insertUser(user);
	}

}
