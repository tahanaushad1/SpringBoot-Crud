package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice; 
	
	@PostMapping("/student")
	public Student addStdDetails(@RequestBody Student std){
		return studentservice.addStdDetailsService(std);
	}
	
	@GetMapping("/student/{rollno}")
	public Student getStdDetails(@PathVariable int rollno) {
		
		return studentservice.getStdDetailsByRollnoService(rollno);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudentSetailsService(){
		return studentservice.getallStudentDetails();
	}
	
	@PutMapping("/student/{rollno}/{marks}")
	public Student updateStdDetails(@PathVariable int rollno, @PathVariable float marks)
	{
		return studentservice.updateStudentDetails(rollno, marks);
	}

}
