package com.vti.entity;

public class Staff {
	private String name;
	private int age;
	private Gender gender;
	private String address;
	
	public enum Gender{
		MALE, FEMALE, UNKNOWN;
	}

	public Staff(String name, int age, Gender gender, String address) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
		this.setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
}
