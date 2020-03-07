package com.kk.service.consumer.client;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import com.kk.service.consumer.controller.GreetingController;

@Configuration
@EnableFeignClients
public class HellowClientFeign {

	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

	@Autowired
	private HelloClient helloClient;

	public String helloWorld() {
		LOGGER.info("helloWorld Starting in HellowClientFeign {} ", new Date());
		return helloClient.helloWorld();
	}
}
