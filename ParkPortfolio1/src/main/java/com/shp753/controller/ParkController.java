package com.shp753.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/park/*")
public class ParkController {

	
	// @ResponseBody를 붙여서 리턴해야 rest api 방식으로 사용가능
	@RequestMapping("")
	public @ResponseBody void hi() {
		System.out.println("hi!");
	}
}
