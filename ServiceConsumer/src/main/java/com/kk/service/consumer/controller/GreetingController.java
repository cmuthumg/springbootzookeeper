package com.kk.service.consumer.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kk.service.consumer.client.HellowClientFeign;
import com.kk.service.consumer.entity.Item;

@RestController
public class GreetingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

	@Autowired
	private HellowClientFeign hellowClientFeign;

	@GetMapping("/greeting/{msg}")
	public String greeting(@PathVariable("msg") String msg) {
		LOGGER.info("greeting Starting {} ", new Date());
		return hellowClientFeign.greeding(msg);
	}

	@GetMapping("/get-greeting")
	public String helloworld() {
		LOGGER.info("greeting Starting {} ", new Date());
		return hellowClientFeign.helloWorld();
	}

	@PostMapping(path="/save/item")
	public String storeItem(@RequestBody Item item) {

		return hellowClientFeign.storeItem(item);
	}

	@GetMapping("/get/all")
	@ResponseBody
	public List<Item> getAllItems() {
		return hellowClientFeign.getAllItems();
	}
}
