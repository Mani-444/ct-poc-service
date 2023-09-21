package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class TestController {
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	@GetMapping("/invokeAdd")
	public int add(@RequestParam(value="num1") int val1,@RequestParam(value="num2") int val2) {
		System.out.println("val1: "+val1+"|val2: "+val2);
		int res=val1+val2;
		System.out.println("res: "+res);
		return res;
	}

}
