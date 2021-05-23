package com.vti.frontend;

import java.time.LocalDate;
import java.util.Scanner;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.positionName;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question8();
	}
	
	public static void Question1() {
		Scanner sc = new Scanner(System.in);
		// question 1:
		// Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
		System.out.println("Question 1: \n");
		int a,b,c;
		System.out.println("Nhập vào số thứ 1: ");
		a = sc.nextInt();
		System.out.println("Nhập vào số thứ 2: ");
		b = sc.nextInt();
		System.out.println("Nhập vào số thứ 3: ");
		c = sc.nextInt();
		System.out.println("\n");
	}
	
	public static void Question2() {
		Scanner sc = new Scanner(System.in);
		// question 2:
		// Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình

		System.out.println("Question 2: \n");
		float a1,b1;
		System.out.println("Nhập vào số thứ 1: ");
		a1 = sc.nextFloat();
		System.out.println("Nhập vào số thứ 2: ");
		b1 = sc.nextFloat();
		System.out.println("\n");
	}
	
	public static void Question3() {
		Scanner sc = new Scanner(System.in);
		
		// question 3:
		// Viết lệnh cho phép người dùng nhập họ và tên
		
		System.out.println("Question 3: \n");
		
		String firstName, lastName, fullName;
		System.out.println("Nhập vào họ ");
		firstName = sc.next();
		System.out.println("Nhập vào tên ");
		lastName = sc.next();
		fullName = firstName + " " + lastName;
		System.out.println("Họ và tên : " + fullName);
		System.out.println("\n");
	}
	
	public static void Question4() {
		Scanner sc = new Scanner(System.in);
		// question 4:
		// Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
		System.out.println("Question 4: \n");
		int day, month, year;
		
		System.out.println("Nhập vào ngày sinh : ");
		day = sc.nextInt();
		System.out.println("Nhập vào tháng sinh : ");
		month = sc.nextInt();
		System.out.println("Nhập vào năm sinh : ");
		year = sc.nextInt();
		LocalDate dob = LocalDate.of(year, month, day);
		System.out.println("Ngày sinh nhật của bạn: " + dob);
		System.out.println("\n");
	}
	
	public static void Question5() {
		// question 5:
		/*
		 * Viết lệnh cho phép người dùng tạo account (viết thành method) Đối với
		 * property Position, Người dùng nhập vào 1 2 3 4 5 và vào chương trình sẽ
		 * chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Question 5: \n");
		
		
		Account ac1 = new Account();
		System.out.println("Nhập ID: ");
		ac1.id = sc.nextInt();
		System.out.println("Nhập email: ");
		ac1.email = sc.next();
		System.out.println("Nhập username: ");
		ac1.userName = sc.next();
		System.out.println("Nhập fullname: ");
		ac1.fullName = sc.next();
		System.out.println("Nhập position: ");
		System.out.println("Chọn các số từ 1 đến 4 tương ứng với các vị trí: 1- Dev, 2- Test, 3- Scrum_Master, 4- PM");
		int accpo = sc.nextInt();
		switch(accpo) {
		case 1:
			Position po1 = new Position();
			po1.name = positionName.Dev;
			ac1.position = po1;
			break;
		case 2:
			Position po2 = new Position();
			po2.name = positionName.Test;
			ac1.position = po2;
			break;
		case 3:
			Position po3 = new Position();
			po3.name = positionName.Scrum_Master;
			ac1.position = po3;
			break;
		case 4:
			Position po4 = new Position();
			po4.name = positionName.PM;
			ac1.position = po4;
			break;
		}
		System.out.println("\n");
		
		System.out.println("Thông tin account: ");
		System.out.println("ID: " + ac1.id);
		System.out.println("Email: " + ac1.email);
		System.out.println("Username: " + ac1.userName);
		System.out.println("Fullname: " + ac1.fullName);
		System.out.println("Position: " + ac1.position.name);
	}
	
	public static void Question6() {
		Scanner sc = new Scanner(System.in);
		
		// question 6:
		// Viết lệnh cho phép người dùng tạo department (viết thành method)
		// System.out.println("Question 6: \n");
		Department de1 = new Department();
		System.out.println("Nhập ID: ");
		de1.id = sc.nextInt();
		System.out.println("Nhập name: ");
		de1.name = sc.next();
		// System.out.println("\n");
	}
	
	public static void Question7() {
		Scanner sc = new Scanner(System.in);
		
		// question 7:
		// Nhập số chẵn từ console
		int i;
		
		while (true) {
			System.out.println("Nhập vào 1 số : ");
			i = sc.nextInt();
			if(i % 2 == 0) {
				System.out.println("Số hợp lệ");
			}else {
				System.out.println("Đây không phải số chẵn vui lòng nhập lại");
			}
		}

	}
	
	public static void Question8() {
		Scanner sc = new Scanner(System.in);
		
		// question 8:
//		Viết chương trình thực hiện theo flow sau:
//			Bước 1:
//			Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//			dụng"
//			Bước 2:
//			Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//			Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//			department
//			Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//			lại" và quay trở lại bước 1
		
		System.out.println("Question 8: \n");

		
		int x;
		while (true) {
			System.out.println("Mời bạn chọ chức năng: ");
			System.out.println("1. Tạo Account");
			System.out.println("2. Tạo Department");
			x = sc.nextInt();
			if(x == 1 || x == 2) {
				switch(x) {
				case 1:
					Question5();
					break;
				case 2:
					Question6();
					break;
				}
				return;
			}else {
				System.out.println("Nhập lại: ");
			}
		}

	}
	
	 public static void Question9() {
			Scanner sc = new Scanner(System.in);
			
			// question 9:  Viết method cho phép người dùng thêm group vào account theo flow sau:

//			Bước 1:
//				In ra tên các usernames của user cho người dùng xem
//				Bước 2:
//				Yêu cầu người dùng nhập vào username của account
//				Bước 3:
//				In ra tên các group cho người dùng xem
//				Bước 4:
//				Yêu cầu người dùng nhập vào tên của group
//				Bước 5:
//				Dựa vào username và tên của group người dùng vừa chọn, hãy
//				thêm account vào group đó .
			
			
			
			// create group
			Group gr1 = new Group();
			gr1.id = 1;
			gr1.name = "Java Fresher";
			gr1.createDate = LocalDate.of(2021, 1, 1);

			Group gr2 = new Group();
			gr2.id = 2;
			gr2.name = "C# Fresher";
			gr2.createDate = LocalDate.of(2021, 1, 1);

			Group gr3 = new Group();
			gr3.id = 3;
			gr3.name = "Sale";
			gr3.createDate = LocalDate.of(2021, 1, 1);

			// create account
			Account ac1 = new Account();
			ac1.id = 1;
			ac1.email = "account1@gmail.com";
			ac1.userName = "ACC1";
			ac1.fullName = "Account 1";

			ac1.createDate = LocalDate.of(2021, 01, 01);
			ac1.groups = new Group[] {gr2};
			
			
			Account ac2 = new Account();
			ac2.id = 2;
			ac2.email = "account2@gmail.com";
			ac2.userName = "ACC2";
			ac2.fullName = "Account 2";

			ac2.createDate = LocalDate.of(2020, 12, 12);
			ac2.groups = new Group [] {gr1, gr3};
			
			Account ac3 = new Account();
			ac3.id = 3;
			ac3.email = "account3@gmail.com";
			ac3.userName = "ACC3";
			ac3.fullName = "Account 3";
	
			ac3.createDate = LocalDate.of(2021, 1 , 1);
			
			// creat group account
			gr1.accounts = new Account[] {ac2};
			gr2.accounts = new Account[] {ac1};
			gr3.accounts = new Account[] {ac2};
			
			
			// create list account
			Account[] listAcc = {ac1, ac2, ac3};
			
			// create list group
			Group[] listGr = {gr1, gr2, gr3};
			// bước 1 : In ra tên các usernames của user cho người dùng xem
			System.out.println("Danh sách các user: ");
			for(int i = 0; i < listAcc.length; i++) {
				System.out.println(listAcc[i].userName);
			}
			

			// bước 2: Yêu cầu người dùng nhập vào username của account
			String user;
			System.out.println("Nhập vào user:");
			user = sc.next();
			
			// bước 3: In ra tên các group cho người dùng xem
			for(int i = 0; i < listGr.length; i++) {
				System.out.println(listGr[i].name);
			}
			
			// bước 4: Yêu cầu người dùng nhập vào tên của group
			String grname;
			System.out.println("Nhập vào tên group:");
			grname = sc.next();
			
			// bước 5: Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó
			
			System.out.println("Nhập vào tên Group cần thêm: ");
			String nameofgr = sc.next();
			
			int idgroup = 0;
			for(int i = 0; i < listGr.length; i++) {
				if(listGr[i].name == nameofgr) {
					idgroup = i;
				}
			}
			
			int idofac = 0;
			for(int i = 0; i < listAcc.length; i++) {
				if(listAcc[i].userName == user) {
					idofac = i;
				}
			}
			
			if(idgroup < 0 || idofac < 0) {
				System.out.println("Account hoặc group không hợp lệ");
			}else {
				for(int i = 0; i < listAcc.length; i++) {
					Group[] addGr = {listGr[idgroup]};
					listAcc[i].groups = addGr;
					System.out.println("Group : " + listAcc[idofac].groups[0].name + " vừa được thêm vào account: " + listAcc[idofac].userName);
				}
			}
	 }
}
