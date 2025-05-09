package com.vti.microservice_3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


//MICROSERVICES-1 is the name regitered in eureka server
//CTR+SHIFT+X
@FeignClient(name="MICROSERVICES-1")
public interface Client {
	
	@GetMapping("/message")
	public String getData();

}
