package com.kk.service.consumer.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kk.service.consumer.entity.Item;

@FeignClient(name = "ServiceProvider")
public interface HelloClient {

	@RequestMapping(path = "/helloworld", method = RequestMethod.GET)
	@ResponseBody
	String helloWorld();

	@RequestMapping(path = "/greeding/{msg}", method = RequestMethod.GET)
	@ResponseBody
	String greeding(@PathVariable("msg") String msg);

	@RequestMapping(path = "/save/item", method = RequestMethod.POST)
	@ResponseBody
	String storeItem(@RequestBody Item item);

	@RequestMapping(path = "/get/all")
	@ResponseBody
	List<Item> getAllItems();
}
