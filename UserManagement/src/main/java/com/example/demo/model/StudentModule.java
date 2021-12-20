package com.example.demo.model;

public class StudentModule {
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private String nameOfInstituition;
	Universities univ = new Universities();
	Schools school = new Schools();
	Library library = new Library();

	public StudentModule()
	{
		
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

	public String getNameOfInstituition() {
		return nameOfInstituition;
	}

	public void setNameOfInstituition(String nameOfInstituition) {
		this.nameOfInstituition = nameOfInstituition;
	}

	public Universities getUniv() {
		return univ;
	}

	public void setUniv(Universities univ) {
		this.univ = univ;
	}

	public Schools getSchool() {
		return school;
	}

	public void setSchool(Schools school) {
		this.school = school;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}


	
}

