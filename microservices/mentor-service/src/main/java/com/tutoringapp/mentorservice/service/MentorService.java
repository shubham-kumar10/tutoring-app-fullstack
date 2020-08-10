package com.tutoringapp.mentorservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutoringapp.mentorservice.model.Mentor;
import com.tutoringapp.mentorservice.model.MentorDTO;
import com.tutoringapp.mentorservice.model.Mentor_Skill;
import com.tutoringapp.mentorservice.model.SkillDetails;
import com.tutoringapp.mentorservice.model.Skills;
import com.tutoringapp.mentorservice.repository.MentorRepository;
import com.tutoringapp.mentorservice.repository.Mentor_SkillRepository;
import com.tutoringapp.mentorservice.repository.SkillRepository;

@Service
public class MentorService {

	@Autowired
	MentorRepository mentorRepository;

	@Autowired
	SkillRepository skillRepository;

	@Autowired
	Mentor_SkillRepository mentor_skillRepository;

	public void editSkill(MentorDTO mentorDetails) {

		Optional<Mentor> newMentor = mentorRepository.findById(mentorDetails.getMentor().getId());
		if (newMentor.isPresent()) {
			
			for (SkillDetails skill : mentorDetails.getSkills()) {
				Skills mentorSkill = skillRepository.findById(skill.getSkill_id()).get();
				float self_rating = skill.getSelf_rating();
				int yearsOfExperience = skill.getYearsOfExperience();
				Mentor_Skill mentor_skill = new Mentor_Skill(newMentor.get(), mentorSkill, self_rating,
						yearsOfExperience);
				mentor_skillRepository.save(mentor_skill);
			}
			
		}
		else{
			
		}

	}
}
