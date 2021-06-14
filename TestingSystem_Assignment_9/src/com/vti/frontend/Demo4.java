package com.vti.frontend;

import com.vti.entity.Student;

public class Demo4 {
	@SuppressWarnings("deprecated")
	public static void main(String[] args) {

		System.out.println("Tạo phương thức getID ban đầu: ");
		Student st1 = new Student("Student1");
		System.out.println("Sinh viên tạo là ID: " + st1.getId() + " Name: " + st1.getName());

		Student st2 = new Student("Studen2");
		System.out.println("Sinh viên tạo là ID : " + st2.getIdWithMSV() + " Name: " + st2.getName());
	}
}
