package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/sirfjava")
public class StudentController {

	@Autowired StudentService studentService;
	
	@PostMapping("/saveData")
	public String saveStudentData(@RequestBody StudentEntity studentEntity) {
		
		
		
		
		return studentService.saveStudentData(studentEntity);
	}
	
	@GetMapping("/getData")
	public Optional<StudentEntity> getSingleData(@RequestParam("id") int id ){
		
		System.out.println(id);
		return studentService.getSingleData(id);
	}
	
	@GetMapping("/getAllData")
	public List<StudentEntity> getAllData(){
		return studentService.getAllData();
	}
	
	
	@PostMapping("/saveData2")
	public String saveStudentData2(@RequestBody StudentDTO studentDTO) {
		
		
		
		
		
		return studentService.saveStudentData2(studentDTO);
	}
	
	
	
	
	
}
