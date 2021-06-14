package com.vti.entity;

import com.vti.ultis.ScannerUltis;

public class Student {
//	Khai báo 1 class student có các thuộc tính id, name, college
//	Với college là static variable

	private int id;
	private String name;
	
	// Tất cả các student đầu học ở "Đại học Bách Khoa"
	public static String collect = "Đại học Bách Khoa";
	public static int COUNT = 0;
	
	// Thuộc tính moneyGroup dùng cho tất cả các student giống như COUNT
	public static int moneyGroup;

	public Student() {
		super();
		this.id = COUNT++;
		this.name = ScannerUltis.inputString();
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

	public  String getCollect() {
		return Student.collect;
	}

	public void setCollect(String newCollect) {
		Student.collect = newCollect;
	}

	public static int getCOUNT() {
		return COUNT;
	}

	public static void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}

	public int getMoneyGroup() {
		return moneyGroup;
	}

	public void setMoneyGroup(int moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + " collect:" + collect + ", moneyGroup=" + moneyGroup + "]";
	}

}
