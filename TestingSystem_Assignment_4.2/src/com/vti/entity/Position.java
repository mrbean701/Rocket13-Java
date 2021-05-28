package com.vti.entity;

public class Position {
	private int id;
	private positionName name;
	
	private enum positionName {
		Dev, Test, Scrum_Master, PM;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public positionName getName() {
		return name;
	}

	public void setName(positionName name) {
		this.name = name;
	}
}
