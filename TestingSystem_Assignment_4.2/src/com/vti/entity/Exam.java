package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	private int ID;
	private String code;
	private String title;
	private CategoryQuestion categoryID;
	private LocalDate duration;
	private Account creatorID;
	private LocalDate createDate;
	
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public CategoryQuestion getCategoryID() {
		return categoryID;
	}
	
	public void setCategoryID(CategoryQuestion categoryID) {
		this.categoryID = categoryID;
	}
	
	public LocalDate getDuration() {
		return duration;
	}
	
	public void setDuration(LocalDate duration) {
		this.duration = duration;
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
	
}
