package com.cpt.payments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cpt.payments.pojo.AddRequest;
import com.cpt.payments.pojo.AddResponse;

@RestController
@RequestMapping("/controller")
public class TestController {
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	@GetMapping("/invokeAdd")
	@ResponseBody
	public AddResponse add(@RequestBody AddRequest request) {
		System.out.println("Request JSON: "+request);
		
		int res=request.getNum1()+request.getNum2();
		AddResponse response=new AddResponse();
		response.setRes(res);
		System.out.println("Respose JSON : "+response);
		return response;
	}

}
