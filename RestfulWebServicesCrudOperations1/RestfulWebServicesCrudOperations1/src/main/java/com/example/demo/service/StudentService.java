package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	public Student addStdDetailsService(Student std);
	public Student getStdDetailsByRollnoService(int rollno);
	public List<Student> getallStudentDetails();
	public Student updateStudentDetails(int rollno, float marks);
}
