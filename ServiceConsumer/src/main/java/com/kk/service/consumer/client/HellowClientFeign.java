package com.kk.service.consumer.client;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import com.kk.service.consumer.controller.GreetingController;
import com.kk.service.consumer.entity.Item;

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

	public String greeding(String msg) {
		LOGGER.info("helloWorld Starting in HellowClientFeign {} ", new Date());
		return helloClient.greeding(msg);
	}

	public String storeItem(Item item) {
		LOGGER.info("iten {} ", item.getItemId());
		return helloClient.storeItem(item);
	}

	public List<Item> getAllItems() {
		return helloClient.getAllItems();
	}
}
