package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController {

	@ResponseBody
	@GetMapping("/hello")
//	@PostMapping
//	@PutMapping
//	@DeleteMapping
//	@RequestMapping
	public String handle01() {
		return "OK!+哈哈";
	}
}