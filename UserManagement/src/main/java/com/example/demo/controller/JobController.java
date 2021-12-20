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

import com.example.demo.model.JobseekerModule;
import com.example.demo.model.User;
import com.example.demo.repository.JobseekerRepository;
import com.example.demo.repository.UserRepository;

@CrossOrigin
@RestController
public class JobController {
	@Autowired
	private JobseekerRepository jobseeker;
	
	@PostMapping("/createjob")
	public String createUser(@RequestBody JobseekerModule job)
	{
		jobseeker.save(job);
		return "added user with id"+job.getId();
	}
	
	@PostMapping("/deletejob/{id}")
	public void deleteUser(@PathVariable String id) {
		jobseeker.deleteById(id);
	}
	
	@GetMapping("/listjob")
	public List<JobseekerModule> listUsers()
	{
		return jobseeker.findAll();
	}

	@GetMapping("/listjob/{id}")
	public Optional<JobseekerModule> getUser(@PathVariable String id){
		return jobseeker.findById(id);
	}
}


