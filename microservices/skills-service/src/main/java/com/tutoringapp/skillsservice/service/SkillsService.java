package com.tutoringapp.skillsservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutoringapp.skillsservice.model.Skills;
import com.tutoringapp.skillsservice.repository.SkillRepository;



@Service
public class SkillsService {

	@Autowired 
	SkillRepository skillRepository;
	
	public void saveSkill(Skills skill) {
		skillRepository.save(skill);
	}
	
	public List<Skills> getAllSkill() {
		return skillRepository.findAll();
	}
	
	public Skills getSkill(String name) {
		return skillRepository.findByName(name);
	}
	
	public void deleteSkill(String technologyName) {
		skillRepository.delete(skillRepository.findByName(technologyName));
	}
}
