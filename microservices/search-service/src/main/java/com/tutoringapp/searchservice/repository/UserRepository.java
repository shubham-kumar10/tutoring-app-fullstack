package com.tutoringapp.searchservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.searchservice.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
