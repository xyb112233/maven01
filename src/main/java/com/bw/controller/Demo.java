package com.bw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo {
	/**
	 * 
	 * @Title: hello 
	 * @Description: TODO
	 * @return 跳转页面
	 * @return: String
	 */
	
	@RequestMapping("list")
	public String hello() {
		//进行页面的跳转
		return "hello";
	}
}
