package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	public int ID;
	public String code;
	public String title;
	public CategoryQuestion categoryID;
	public LocalDate duration;
	public Account creatorID;
	public LocalDate createDate;
}
