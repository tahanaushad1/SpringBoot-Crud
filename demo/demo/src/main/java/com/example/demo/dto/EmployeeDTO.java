package com.example.demo.dto;

public class EmployeeDTO {
 private int empId;
 private String empName;
 private String address;
 private String mobile;
 
 private String salary;
 private String department;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
@Override
public String toString() {
	return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", address=" + address + ", mobile=" + mobile
			+ ", salary=" + salary + ", department=" + department + "]";
}

 
 
}
