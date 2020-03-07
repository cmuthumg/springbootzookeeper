package com.kk.service.provider.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HellowController.class);

	private static int count = 0;

	@GetMapping("/helloworld")
	public String helloWorld() {
		count++;
		LOGGER.info("helloWorld {}, {}", count, new Date());
		return "Hello World! > " + count;
	}

}
