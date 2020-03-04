package com.kk.service.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

	private static int count =0;
	@GetMapping("/helloworld")
	public String helloWorld() {
		count ++;
		return "Hello World! > "+count;
	}

}
