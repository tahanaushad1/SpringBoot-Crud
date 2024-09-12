package com.example.demo.service;

import com.example.demo.dto.EmployeeDTO;

public interface EmployeeService {
 public String saveEmpInfo(EmployeeDTO employeeDTO);
 public String saveSalaryInfo(EmployeeDTO employeeDTO);
}
