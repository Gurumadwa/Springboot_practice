package com.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.entity.User;
import com.mapping.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

}
