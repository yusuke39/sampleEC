package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ShowItemController {
	
	/**
	 * メイン画面を表示する.
	 * 
	 * @return index.html
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
