package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repositoty.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired StudentRepo studentRepo;
	
	@Override
	public String saveStudentData(StudentEntity studentEntity) {
		
		studentRepo.save(studentEntity);
		
		return "Data Save successfully";
	}
	
	@Override
	public String saveStudentData2(StudentDTO studentDTO) {
		
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(studentDTO.getName().toLowerCase());
		studentRepo.save(studentEntity);
		
		return "data save";
	}

	@Override
	public Optional<StudentEntity> getSingleData(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}

	@Override
	public List<StudentEntity> getAllData() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	
	

}
