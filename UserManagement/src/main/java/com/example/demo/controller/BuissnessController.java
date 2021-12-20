
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

import com.example.demo.model.BuisnessModule;
import com.example.demo.repository.BuissnessRepository;

@CrossOrigin
@RestController
public class BuissnessController {
	@Autowired
	private BuissnessRepository buissnessrepository;
	
	@PostMapping("/createbuissness")
	public String createBuissness(@RequestBody BuisnessModule buissness)
	{
		buissnessrepository.save(buissness);
		return "added sucessfully";
	}
	
	@PostMapping("/deletebuissness/{id}")
	public void deleteBuissness(@PathVariable String id) {
		buissnessrepository.deleteById(id);
	}
	
	@GetMapping("/listbuissness")
	public List<BuisnessModule> listBuissness()
	{
		return buissnessrepository.findAll();
	}

	@GetMapping("/listbuissness/{id}")
	public Optional<BuisnessModule> getBuisness(@PathVariable String id){
		return buissnessrepository.findById(id);
	}
}


