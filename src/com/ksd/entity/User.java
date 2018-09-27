package com.ksd.entity;

public class User {
	private String userName;
	private int id;
	private int userAge;
	
	public User(String userName, int id, int userAge) {
		this.userName = userName;
		this.id = id;
		this.userAge = userAge;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
}
