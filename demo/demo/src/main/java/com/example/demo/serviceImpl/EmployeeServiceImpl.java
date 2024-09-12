package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmplyeeInfo;
import com.example.demo.entity.SalaryInfo;
import com.example.demo.repositoty.EmployeeInfoRepo;
import com.example.demo.repositoty.SalaryInfoRepo;

import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired 
EmployeeInfoRepo  employeeInfoRepo;

@Autowired
SalaryInfoRepo salaryInfoRepo;

	@Override
	public String saveEmpInfo(EmployeeDTO employeeDTO) {
		EmplyeeInfo emp= new EmplyeeInfo();
		emp.setEmpName(employeeDTO.getEmpName());
		emp.setAddress(employeeDTO.getAddress());
		emp.setMobile(employeeDTO.getMobile());
		
		employeeInfoRepo.save(emp);
		return "sava successfully";
	}

	@Override
	public String saveSalaryInfo(EmployeeDTO employeeDTO) {
		SalaryInfo emp= new SalaryInfo();
		emp.setSalary(employeeDTO.getSalary());
		emp.setDepartment(employeeDTO.getDepartment());
		salaryInfoRepo.save(emp);
		return "sava successfully";
	}

}
