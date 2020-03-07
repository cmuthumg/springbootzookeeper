package com.kk.service.consumer.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.service.consumer.client.HellowClientFeign;

@RestController
public class GreetingController {
  
	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);
	
    @Autowired
    private HellowClientFeign hellowClientFeign;
 
    @GetMapping("/get-greeting")
    public String greeting() {
    	LOGGER.info("greeting Starting {} ", new Date());
        return hellowClientFeign.helloWorld();
    }
}
