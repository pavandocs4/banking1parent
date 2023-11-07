package com.banking.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banking.user.entity.User;
import com.banking.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/user-service/adduser")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		User savedUser = userService.saveUser(user);
		return new ResponseEntity(savedUser, HttpStatus.CREATED);
	}

	@GetMapping(path = "/user-service/getuser")
	public ResponseEntity<?> getUser(@PathVariable long id) {
		Optional<User> userEntity = userService.getUserById(id);
		return new ResponseEntity(userEntity, HttpStatus.FOUND);
	}

	@GetMapping(path = "/user-service/getallusers")
	public ResponseEntity<?> getAllUsers() {
		List<User> users = userService.getUsers();
		return new ResponseEntity(users, HttpStatus.FOUND);
	}

}
