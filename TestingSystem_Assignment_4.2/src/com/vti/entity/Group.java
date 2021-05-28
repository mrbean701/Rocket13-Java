package com.vti.entity;

import java.time.LocalDate;

public class Group {
	private int id;
	private String name;
	private Account creatorID;
	private LocalDate createDate;
	private Account[] accounts;
	
	
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
	
	public Account getCreatorID() {
		return creatorID;
	}
	
	public void setCreatorID(Account creatorID) {
		this.creatorID = creatorID;
	}
	
	public LocalDate getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	public Account[] getAccounts() {
		return accounts;
	}
	
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	
	

}
