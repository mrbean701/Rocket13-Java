package com.vti.entity;

public class Worker extends Staff {
	private int rank;
	
	public Worker(String name, int age, Gender gender, String address) {
		super(name, age, gender, address);
		this.setRank(rank);
	}



	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}



	@Override
	public String toString() {
		return "Worker [rank=" + rank + "]";
	}

	
}
