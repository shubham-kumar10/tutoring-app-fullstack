package com.tutoringapp.skillsservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.skillsservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
