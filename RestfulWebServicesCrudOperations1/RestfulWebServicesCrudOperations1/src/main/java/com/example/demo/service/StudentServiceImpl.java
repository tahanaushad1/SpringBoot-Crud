package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStdDetailsService(Student std) {
		
		return studentRepository.save(std);
	}
	
	@Override
	public Student getStdDetailsByRollnoService(int rollno) {
		
		return studentRepository.findByRollno(rollno);
	}

	@Override
	public List<Student> getallStudentDetails() {
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudentDetails(int rollno, float marks) {
		Student std = studentRepository.findByRollno(rollno);
		std.setMarks(marks);
		return studentRepository.save(std);
	}
}
