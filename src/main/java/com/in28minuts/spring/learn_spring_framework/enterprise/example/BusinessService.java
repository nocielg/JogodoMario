package com.in28minuts.spring.learn_spring_framework.enterprise.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

	@Autowired
	private DataService dataService;
	public long calculateSum() {
		List<Integer> data = dataService.getData();
		//Soma o valor da lista
		return data.stream().reduce(Integer::sum).get();
		
	}
}
