package com.kk.service.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "ServiceProvider")
public interface HelloClient {

	@RequestMapping(path = "/helloworld", method = RequestMethod.GET)
	@ResponseBody
	String helloWorld();
}
