package com.banking.user.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.banking.user.entity.User;
import java.util.*;

@Component
public interface UserService {

	public User saveUser(User user);

	public Optional<User> getUserById(long id);

	public List<User> getUsers();

}
