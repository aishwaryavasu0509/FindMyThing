package com.example.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.model.User;
import com.example.demo.model.User;
import com.example.demo.model.*;
@Document(collection="users")

public class User {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	
	BuisnessModule buisness=new BuisnessModule();


	
	public BuisnessModule getBuisness() {
		return buisness;
	}
	
	public void setBuisness(BuisnessModule buisness) {
		this.buisness = buisness;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

