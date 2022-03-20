package com.grocery.model;

public class User {
	private String username;
	private String password;
	public String getUsername() {
		System.out.println("get method called");
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		System.out.println("Object created");
	}
	
	

}
