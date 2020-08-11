package com.tutoringapp.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutoringapp.studentservice.model.User;

public interface StudentRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

}
