package com.vti.frontend;

import java.util.Scanner;

import com.vti.entity.Department;

public class DemoExercise2 {
	public static void main(String[] args) {
		//question1();
		//question3();
		question4();
	}

	private static void question1() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhập vào số thứ 1: ");
		a = sc.nextInt();
		System.out.println("Nhập vào số thứ 2: ");
		b = sc.nextInt();
		try {
			System.out.println("Kết quả của phép chia là: " + Exercise2.divide(a, b));
		} catch (Exception e) {
			System.err.println("Có lỗi khi thực hiện phép chia số 0");
		} finally {
			System.out.println("\n");
			System.out.println("Hoàn thành phép chia");
		}
	}

	private static void question3() {
		int[] numbers = { 1, 2, 3 };
		try {
			System.out.println(numbers[10]);
		} catch (Exception e) {
			System.err.println("Không tìm thấy phần tử này trong mảng");

		}
	}
	
	private static void question4() {
		Department de1 = new Department("Dep1");
		Department de2 = new Department("Dep2");
		Department de3 = new Department("Dep3");
		Department[] deArr = {de1,de2,de3};
		
		try {
			System.out.println(deArr[10]);
		} catch (Exception e) {
			System.out.println("Không thể tìm thấy department này!!!");
		}
	}
	
	
}
