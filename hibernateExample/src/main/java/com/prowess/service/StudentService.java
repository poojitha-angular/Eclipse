package com.prowess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowess.dao.StudentRepository;
import com.prowess.entities.Student;

@Service
public class StudentService {
	@Autowired
	 private static StudentRepository dao;

	public static Student saveStudent(Student student) {
		
		Student stdnt= new Student();
		stdnt.setName(student.getName());
		stdnt.setMarks(student.getMarks());
//		Student st=student.save(stdnt);
		dao.save(stdnt);
	
		return student;
	}

	
}
