package com.tutoringapp.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.authservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
