package com.vti.backend;

import java.util.Date;

import com.vti.entity.Student;

public class Exercise2 {
	public void question1() {
		System.out.println("Question1: ");
		Date date1 = new Date();
		System.out.println(date1);
		System.out.println("\n");
	}
	
	public void question2() {
		System.out.println("Question2: ");
		System.out.println("Tạo sinh viên với phương thức getID ban đầu: ");
		Student st1 = new Student("Student1");
		System.out.println("Sinh viên tạo là ID: " + st1.getId() + " Name: " + st1.getName());
		
		System.out.println("Sử dụng phương thức getID bản mới: ");
		System.out.println("Sinh viên tạo là ID: " + st1.getIdWithMSV() + " Name: " + st1.getName());
		System.out.println("\n");
	}
}
