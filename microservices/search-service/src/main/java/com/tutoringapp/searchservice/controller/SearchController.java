package com.tutoringapp.searchservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutoringapp.searchservice.model.Mentor_Skill;
import com.tutoringapp.searchservice.service.SearchService;

@RestController
@RequestMapping("/mentorList")
public class SearchController {

	@Autowired
	SearchService mentorSkillService;
	
	@GetMapping
	public List<Mentor_Skill> getMentorDetails() {
		return mentorSkillService.getAllDetails();
	}
	
	@GetMapping("/{skill_id}")
	public List<Mentor_Skill> searchMentor(@PathVariable("skill_id") int skill_id) {
		return mentorSkillService.searchMentor(skill_id);
	}
	
}
