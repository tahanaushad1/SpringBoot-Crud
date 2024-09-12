package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("tcs")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveData")
	public String saveEmployeeData(@RequestBody EmployeeDTO eployeeDTO) {
		
		System.out.println(eployeeDTO);
		employeeService.saveEmpInfo(eployeeDTO);
		employeeService.saveSalaryInfo(eployeeDTO);
		return "save data";
	}
}
