package com.prowess.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prowess.entities.Student;
import com.prowess.service.StudentService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;

public class StudentController {

	@PostMapping("/")
	@Operation(tags = {"Student"})
	@ApiOperation(value = "Create ProductDto", consumes = "application/json",produces = "application/json", response = Student.class)
	public ResponseEntity<Student> create(@RequestBody Student Student) {
		Student student = StudentService.saveStudent(Student);
		
		return new ResponseEntity<>(student, HttpStatus.CREATED);
	}
	
}
