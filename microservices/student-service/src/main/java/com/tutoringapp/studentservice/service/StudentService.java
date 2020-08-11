package com.tutoringapp.studentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutoringapp.studentservice.model.User;
import com.tutoringapp.studentservice.repository.StudentRepository;



@Service
public class StudentService {

	@Autowired
	private StudentRepository userRepository;
	
	@Transactional
	public User getUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
}
