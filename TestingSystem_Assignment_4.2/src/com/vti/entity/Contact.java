package com.vti.entity;

public class Contact {
	private String name;


	private String phone;
	
	
	public Contact(String name, String phone) {
		this.setName(name);
		this.setPhone(phone);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + "]";
	}

	
}
