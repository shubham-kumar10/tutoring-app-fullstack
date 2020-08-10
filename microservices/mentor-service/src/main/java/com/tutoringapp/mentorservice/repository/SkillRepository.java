package com.tutoringapp.mentorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.mentorservice.model.Skills;

public interface SkillRepository extends JpaRepository<Skills, Integer>{


}
