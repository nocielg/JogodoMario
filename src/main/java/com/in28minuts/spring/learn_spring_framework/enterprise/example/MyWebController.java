package com.in28minuts.spring.learn_spring_framework.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
	
	@Autowired
	private BusinessService businessService;
	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}




