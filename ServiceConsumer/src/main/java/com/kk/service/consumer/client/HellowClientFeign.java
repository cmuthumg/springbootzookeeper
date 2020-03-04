package com.kk.service.consumer.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients
public class HellowClientFeign {

	@Autowired
    private HelloClient helloClient;

    public String helloWorld() {
        return helloClient.helloWorld();
    }
}
