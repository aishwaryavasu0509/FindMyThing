package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@CrossOrigin
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/create")
	public String createUser(@RequestBody User user)
	{
		userRepository.save(user);
		return "added user with id"+user.getId();
	}
	
	@PostMapping("/delete/{id}")
	public void deleteUser(@PathVariable String id) {
		userRepository.deleteById(id);
	}
	
	@GetMapping("/list")
	public List<User>listUsers()
	{
		return userRepository.findAll();
	}

	@GetMapping("/list/{id}")
	public Optional<User> getUser(@PathVariable String id){
		return userRepository.findById(id);
	}
}
