package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Users;

@Repository
public class RegisterRepository {
	
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public void UserRegister(Users user) {
		
		String sql = "INSERT INTO users(name, email, password) VALUES(:name, :email, :password)";
		
		SqlParameterSource param = new MapSqlParameterSource().addValue("name", user.getName()).addValue("email", user.getEmail()).addValue("password", user.getPassword());
		
		template.update(sql, param);
		
	}
	

}
