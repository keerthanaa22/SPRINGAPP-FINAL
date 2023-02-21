package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentResponse {
	
	private long id;
	@JsonIgnore
	private String firstName;
	private String lastName;
	
	
	public StudentResponse(long id,String firstName,String lastName) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
