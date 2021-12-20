package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class TourismModule {
	
	@Id
	private String id;
	private String nameOfSpot;
	TouristSpots touristspots = new TouristSpots();
	Theatres thearte= new Theatres();
	Hotels hotel=new Hotels();
	Restaurants restaurant = new Restaurants();
	ATM atm = new ATM();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TouristSpots getTouristspots() {
		return touristspots;
	}

	public void setTouristspots(TouristSpots touristspots) {
		this.touristspots = touristspots;
	}

	public Theatres getThearte() {
		return thearte;
	}

	public void setThearte(Theatres thearte) {
		this.thearte = thearte;
	}

	public Hotels getHotel() {
		return hotel;
	}

	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}

	public Restaurants getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurants restaurant) {
		this.restaurant = restaurant;
	}

	public ATM getAtm() {
		return atm;
	}

	public void setAtm(ATM atm) {
		this.atm = atm;
	}

	public TourismModule()
	{
		
	}
	
	public String getNameOfSpot() {
		return nameOfSpot;
	}

	public void setNameOfSpot(String nameOfSpot) {
		this.nameOfSpot = nameOfSpot;
	}
	
}
