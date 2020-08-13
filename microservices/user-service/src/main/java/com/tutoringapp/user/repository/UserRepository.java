package com.tutoringapp.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
