package com.tutoringapp.searchservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.searchservice.model.Mentor_Skill;
import com.tutoringapp.searchservice.model.Skills;

public interface Mentor_SkillRepository extends JpaRepository<Mentor_Skill, Integer>{

	List<Mentor_Skill> findBySkill(Skills skill);


}
