package com.tutoringapp.skillsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.skillsservice.model.Skills;

public interface SkillRepository extends JpaRepository<Skills, Integer>{

	Skills findByName(String name);


}
