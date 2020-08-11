package com.tutoringapp.trainingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.trainingservice.model.Mentor;
import com.tutoringapp.trainingservice.model.User;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

	Mentor findByUser(User user);

}
