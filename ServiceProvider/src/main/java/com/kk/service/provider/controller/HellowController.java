package com.kk.service.provider.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kk.service.provider.entity.Item;

@RestController
public class HellowController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HellowController.class);

	private static final List<Item> items = new ArrayList<>();
	static {
		Item item = new Item("A001", "Apple", 200l);
		items.add(item);
	}

	private static int count = 0;

	@GetMapping("/helloworld")
	public String helloWorld() {
		count++;
		LOGGER.info("helloWorld {}, {}", count, new Date());
		return "Hello World! > " + count;
	}

	@GetMapping("/greeding/{msg}")
	public String greeding(@PathVariable("msg") String msg) {
		LOGGER.info("helloWorld {}, {}", count, new Date());
		return "Welcome " + msg;
	}

	@PostMapping("/save/item")
	public String storeItem(@RequestBody Item item) {
		items.add(item);
		return "Item stored successfully!!!";
	}

	@GetMapping("/get/all")
	@ResponseBody
	public List<Item> getAllItems() {
		return items;
	}

}
