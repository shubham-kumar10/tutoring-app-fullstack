package com.tutoringapp.mentorservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutoringapp.mentorservice.service.MentorService;

@RestController("/mentor")
public class MentorController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MentorController.class);

	@Autowired
	MentorService mentorService;

	@PutMapping("/edit")
	public void editSkill(){
		LOGGER.info("Inside editSkill()");
		
		
		
		LOGGER.info("End of EditSkill()");
	}
	
}
