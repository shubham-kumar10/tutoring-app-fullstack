package com.tutoringapp.skillsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutoringapp.skillsservice.model.Skills;
import com.tutoringapp.skillsservice.service.SkillsService;


@RestController
@RequestMapping("/technology")
public class SkillsController {
	
	@Autowired
	SkillsService skillService;

	@GetMapping("/{skill}")
	public Skills getSkill(@PathVariable("skill") String name) {
		return skillService.getSkill(name);
	}
	
	@GetMapping("")
	public List<Skills> getAllSkill() {
		return skillService.getAllSkill();
	}
	
	@PostMapping("")
	public void postSkill(@RequestBody Skills technology) {
		skillService.saveSkill(technology);
	}
	
	@DeleteMapping("/{name}")
	public void deleteSkill(@PathVariable("name") String technologyName) {
		skillService.deleteSkill(technologyName);
	}
}
