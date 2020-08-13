package com.tutoringapp.user.exception;

public class UserAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserAlreadyExistsException() {
		// TODO Auto-generated constructor stub
		super("User already exists");
	}

}
