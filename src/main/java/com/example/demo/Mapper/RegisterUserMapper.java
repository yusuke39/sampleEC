package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import com.example.demo.domain.Users;

@Mapper
public interface RegisterUserMapper {
	
	void insertUser(Users user);

}
