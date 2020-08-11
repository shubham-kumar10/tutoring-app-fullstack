package com.tutoringapp.trainingservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutoringapp.trainingservice.exception.EndDateCoincideException;
import com.tutoringapp.trainingservice.exception.MentorSkillAlreadyExistsException;
import com.tutoringapp.trainingservice.exception.StartDateCoincideException;
import com.tutoringapp.trainingservice.model.Mentor_Skill;
import com.tutoringapp.trainingservice.model.Training;
import com.tutoringapp.trainingservice.service.TrainingService;

@RestController
public class TrainingController {

	@Autowired
	private TrainingService trainingService;
	
	@PostMapping("/addTrainingRequest")
	public void addTrainingRequest(@RequestBody @Valid Training training) throws StartDateCoincideException, EndDateCoincideException {
		trainingService.addTrainingRequest(training);
	}

	@GetMapping("/getIncompleteTraining/{userName}")
	public List<Training> getIncompleteTraining(@PathVariable String userName) {
		System.out.println(userName);
		return trainingService.getIncompleteTraining(userName);
	}
	
	@PostMapping("/editStatus")
	public void editStatus(@RequestBody @Valid Training training){
		trainingService.editStatus(training);
	}
	
	@PostMapping("/addSkillLogin")
	public void addSkillLogin(@RequestBody @Valid Mentor_Skill mentorSkill) throws MentorSkillAlreadyExistsException{
		trainingService.addSkillLogin(mentorSkill);
	}
}
