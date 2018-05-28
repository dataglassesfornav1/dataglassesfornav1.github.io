package com.projegrup6.vo;

public class Person {

	private String location;
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Person [location=" + location;
	}
}
