package com.vti.entity;

public class Department {
	private int id;
	private String name;
	public static int Count;
	public Department( String name) {
		super();
		Count++;
		this.id = Count;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
}
