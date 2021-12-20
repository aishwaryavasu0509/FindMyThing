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

import com.example.demo.model.StudentModule;
import com.example.demo.repository.StudentRepository;

@CrossOrigin
@RestController
public class StudentController {
	@Autowired
	private StudentRepository studentrepository;
	
	@PostMapping("/createstudent")
	public String createUser(@RequestBody StudentModule student)
	{
		studentrepository.save(student);
		return "added user with id"+student.getId();
	}
	
	@PostMapping("/deletestudent/{id}")
	public void deleteUser(@PathVariable String id) {
		studentrepository.deleteById(id);
	}
	
	@GetMapping("/liststudent")
	public List<StudentModule> listUsers()
	{
		return studentrepository.findAll();
	}

	@GetMapping("/liststudent/{id}")
	public Optional<StudentModule> getUser(@PathVariable String id){
		return studentrepository.findById(id);
	}
}


