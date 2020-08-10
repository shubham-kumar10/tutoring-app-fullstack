package com.tutoringapp.mentorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.mentorservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
