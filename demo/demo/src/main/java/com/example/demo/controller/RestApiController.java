package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDTO;
import com.example.demo.serviceImpl.CalculatorService;

@RestController
@RequestMapping("/sirfjava")
public class RestApiController {

	@Autowired
	CalculatorService calculatorService;
	
	
	
	@PostMapping("/add")
	public String display(@RequestParam("first") String first,@RequestParam("second") String second,@RequestParam("third") String third) {
		int addValue=0;
		
		
		if(third !="") {
			 addValue=	calculatorService.addition(Integer.parseInt(first) , Integer.parseInt(second) , Integer.parseInt(third));
		}else {
			 addValue=	calculatorService.addition(Integer.parseInt(first) , Integer.parseInt(second));
		}
	
		System.out.println("i am here "+first);
		return "Value is "+addValue;
		
	
	}
	
}
