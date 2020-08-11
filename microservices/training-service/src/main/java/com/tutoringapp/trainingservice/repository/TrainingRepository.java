package com.tutoringapp.trainingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.trainingservice.model.Mentor;
import com.tutoringapp.trainingservice.model.Training;
import com.tutoringapp.trainingservice.model.User;


public interface TrainingRepository extends JpaRepository<Training, Long> {

	List<Training> findAllByMentor(Mentor mentor);

	List<Training> findAllByUser(User user);

}
