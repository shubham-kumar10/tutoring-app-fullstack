package com.tutoringapp.trainingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.trainingservice.model.Mentor;
import com.tutoringapp.trainingservice.model.Mentor_Skill;


public interface Mentor_SkillRepository extends JpaRepository<Mentor_Skill, Integer>{
	List<Mentor_Skill> findAllByMentor(Mentor mentor);

}
