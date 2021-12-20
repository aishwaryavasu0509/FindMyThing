

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

import com.example.demo.model.TourismModule;
import com.example.demo.repository.TourismRepository;

@CrossOrigin
@RestController
public class TourismController {
	@Autowired
	private TourismRepository touristRepository;
	
	@PostMapping("/createtouristspot")
	public String createSpot(@RequestBody TourismModule tourist)
	{
		touristRepository.save(tourist);
		return "value inserted";
	
	}
	
	@PostMapping("/deletetouristspot/{id}")
	public void deleteSpot(@PathVariable String id) {
		touristRepository.deleteById(id);
	}
	
	@GetMapping("/listtouristspot")
	public List<TourismModule>listspots()
	{
		return touristRepository.findAll();
	}

	@GetMapping("/listtouristspot/{id}")
	public Optional<TourismModule> getspot(@PathVariable String id){
		return touristRepository.findById(id);
	}
}
