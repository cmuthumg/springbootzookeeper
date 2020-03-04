package com.kk.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kk.service.consumer.client.HellowClientFeign;

@RestController
public class GreetingController {
  
    @Autowired
    private HellowClientFeign hellowClientFeign;
 
    @GetMapping("/get-greeting")
    public String greeting() {
        return hellowClientFeign.helloWorld();
    }
}
