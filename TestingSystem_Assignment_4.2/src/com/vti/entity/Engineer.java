package com.vti.entity;

public class Engineer extends Staff {


	private String specialized;
	



	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}
	
	
	public Engineer(String name, int age, Gender gender, String address) {
		super(name, age, gender, address);
		this.setSpecialized(specialized);
	}
	
	

	@Override
	public String toString() {
		return "Engineer [specialized=" + specialized + "]";
	}
	
}
