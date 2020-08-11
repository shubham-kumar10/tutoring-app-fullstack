package com.tutoringapp.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tutoringapp.studentservice.model.User;
import com.tutoringapp.studentservice.service.StudentService;


@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/findUser/{userName}")
	public User getAllSkills(@PathVariable String userName) {
		return studentService.getUserByUserName(userName);
	}
}
