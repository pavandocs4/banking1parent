package com.banking.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.user.entity.User;
import com.banking.user.repository.UserRepository;
import com.banking.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User usertosave) {
		User saveduser = userRepository.save(usertosave);
		return saveduser;
	}

	@Override
	public Optional<User> getUserById(long id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

}
