package com.sk.service;

import java.util.Optional;

import com.sk.entity.User;

public interface UserService {
	
	Integer saveUser(User user);
	
	Optional<User> findByUsername(String username);
	
}
