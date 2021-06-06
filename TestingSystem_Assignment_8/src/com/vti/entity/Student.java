package com.vti.entity;

public class Student {
//	Tạo 1 student có property id, name (trong đó có 3 student có name
//			trùng nhau, id sẽ là auto increment)

	
	public static int COUNT = 0;
	private int id;
	public Student( String name) {
		super();
		this.id = COUNT++;
		this.name = name;
	}
	private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
