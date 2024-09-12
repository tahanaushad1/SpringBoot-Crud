package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentEntity;

public interface StudentService {

	
	 public String saveStudentData(StudentEntity studentEntity);
	 public String saveStudentData2(StudentDTO studentDTO);
	 public Optional<StudentEntity> getSingleData(int id);
	public List<StudentEntity> getAllData();
}
