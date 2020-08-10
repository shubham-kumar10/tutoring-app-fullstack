package com.tutoringapp.mentorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.mentorservice.model.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Integer>{


}
