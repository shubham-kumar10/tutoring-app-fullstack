package com.tutoringapp.user.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutoringapp.user.exception.UserAlreadyExistsException;
import com.tutoringapp.user.model.Mentor;
import com.tutoringapp.user.model.MentorDTO;
import com.tutoringapp.user.model.Mentor_Skill;
import com.tutoringapp.user.model.SkillDetails;
import com.tutoringapp.user.model.Skills;
import com.tutoringapp.user.model.User;
import com.tutoringapp.user.repository.MentorRepository;
import com.tutoringapp.user.repository.Mentor_SkillRepository;
import com.tutoringapp.user.repository.SkillRepository;
import com.tutoringapp.user.repository.UserRepository;
import com.tutoringapp.user.service.AppUserDetailsService;

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	AppUserDetailsService appUserDetailsService;

	@Autowired
	SkillRepository skillRepository;

	@PostMapping("/signUp")
	public void signupUser(@RequestBody @Valid User newUser) throws UserAlreadyExistsException {
		LOGGER.info("Start of signupUser");
		LOGGER.debug("new User is {}", newUser);
		appUserDetailsService.signup(newUser);
		LOGGER.info("End of signupUser");
	}
	
	@GetMapping("/skills")
	public List<Skills> getAllSkills(){
		return skillRepository.findAll();
	}
	
	@PostMapping("/Mentor")
	public void signUpMentor(@RequestBody @Valid MentorDTO mentorDetails) {
		appUserDetailsService.addMentor(mentorDetails);
	}
	
}
