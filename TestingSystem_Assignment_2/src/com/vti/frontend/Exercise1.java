package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.positionName;


public class Exercise1 {

	public static void main(String[] args) {
		// create department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";
		
		
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";
		
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "BOD";
		
		// create position
		Position po1 = new Position();
		po1.id = 1;
		po1.name = positionName.Dev;
		
		Position po2 = new Position();
		po2.id = 2;
		po2.name = positionName.PM ;
		
		Position po3 = new Position();
		po3.id = 3;
		po3.name = positionName.Scrum_Master;
		
		// create group
		Group gr1 = new Group();
		gr1.id = 1;
		gr1.name = "Java Fresher";
		gr1.createDate = LocalDate.of(2021, 1 , 1);
		
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
		ac1.department = dep1;
		ac1.position = po1;
		ac1.createDate = LocalDate.of(2021, 01, 01);
		ac1.groups = new Group[] {gr2};
		
		
		Account ac2 = new Account();
		ac2.id = 2;
		ac2.email = "account2@gmail.com";
		ac2.userName = "ACC2";
		ac2.fullName = "Account 2";
		ac2.department = dep2;
		ac2.position = po2;
		ac2.createDate = LocalDate.of(2020, 12, 12);
		ac2.groups = new Group [] {gr1, gr3};
		
		Account ac3 = new Account();
		ac3.id = 3;
		ac3.email = "account3@gmail.com";
		ac3.userName = "ACC3";
		ac3.fullName = "Account 3";
		ac3.department = dep3;
		ac3.position = po3;
		ac3.createDate = LocalDate.of(2021, 1 , 1);
		
		
		// create group account
		gr1.accounts = new Account[] {ac2};
		gr2.accounts = new Account[] {ac1};
		gr3.accounts = new Account[] {ac2};
		
		
		// question1:
		/*
		 * Kiểm tra account thứ 2 Nếu không có phòng ban (tức là department == null) thì
		 * sẽ in ra text "Nhân viên này chưa có phòng ban" Nếu không thì sẽ in ra text
		 * "Phòng ban của nhân viên này là …" + "" + "
		 */		
		
		System.out.println("Question 1: \n");
		if(ac2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}else {
			System.out.println("phòng ban của nhân viên này là: " + ac2.department.name);
		}
		System.out.println("\n");
		
		
		// question2:
		/*
		 * Kiểm tra account thứ 2 Nếu không có group thì sẽ in ra text
		 * "Nhân viên này chưa có group" Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra
		 * text "Group của nhân viên này là Java Fresher, C# Fresher" Nếu có mặt trong 3
		 * Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều
		 * group" Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
		 * người hóng chuyện, tham gia tất cả các group"
		 */		
		
		System.out.println("Question 2: \n" );
		if (ac2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		}else {
			int countGroup = ac2.groups.length;
			if(countGroup == 1 || countGroup == 2) {
				System.out.println("Group của nhân viên này là Java, C# Fresher");
			}else if(countGroup == 3){
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				
			}else if(countGroup >= 4) {
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			}
		}
		System.out.println("\n");
		
		
		// question3:
		// Sử dụng toán tử ternary để làm Question 1
		
		
		System.out.println("question3: \n");
		System.out.println(ac2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là: " + ac2.department.name);
		
		System.out.println("\n");
		
		// question4 :
		/*
		 * Sử dụng toán tử ternary để làm yêu cầu sau: Kiểm tra Position của account thứ
		 * 1 Nếu Position = Dev thì in ra text "Đây là Developer" Nếu không phải thì in
		 * ra text "Người này không phải là Developer"
		 */
		
		System.out.println("Question4: \n" );
		System.out.println(ac1.position.name == positionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");
		System.out.println("\n");
		
		// SWITCH CASE
		// question5 :
		/*
		 * Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau: Nếu số
		 * lượng account = 1 thì in ra "Nhóm có một thành viên" Nếu số lượng account = 2
		 * thì in ra "Nhóm có hai thành viên" Nếu số lượng account = 3 thì in ra
		 * "Nhóm có ba thành viên" Còn lại in ra "Nhóm có nhiều thành viên"
		 */
		
		System.out.println("Question5: \n");
		int countQuestion5 = gr1.accounts.length;
		if(gr1.accounts == null) {
			System.out.println("Group chưa có thành viên nào tham gia");
		}else {
			switch (countQuestion5) {
			case 1:
				System.out.println("Nhóm có 1 thành viên");
				break;
			case 2:
				System.out.println("Nhóm có 2 thành viên");
				break;
			case 3:
				System.out.println("Nhóm có 3 thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}
		}
		
		System.out.println("\n");
		
		// question6 :
		//Sử dụng switch case để làm lại Question 2
		
		System.out.println("Question 6: \n");
		int countQuestion6 = ac2.groups.length;
		if(ac2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		}else {
			switch(countQuestion6) {
			case 1:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}
			System.out.println("\n");
		}
		// question 7:
		// Sử dụng switch case để làm lại question 4
		System.out.println("Question 7: \n");
		
		String countQuestion7 = ac1.position.name.toString();
		if(countQuestion7 == null) {
			System.out.println("Người này chưa có position");
		}else {
			switch(countQuestion7) {
			case "Dev":
				System.out.println("Đây là Developer");
				break;
			default :
				System.out.println("Người này không phải Developer");
				break;
			}
		}
		System.out.println("\n");
		
		
		// FOREACH
		// question 8:
		/*
		 * In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
		 */
		
		System.out.println("Question 8: \n");
		
		Account[] accQuestion8 = {ac1, ac2, ac3};
		for(Account account : accQuestion8) {
			System.out.println("AcocuntID: " + account.id + " Email: " + account.email + " FullName: " + account.fullName + " Position: " + account.position.name);
		}
		
		System.out.println("\n");
		
		// question 9:
		// In ra thông tin các phòng ban bao gồm: id và name
		
		System.out.println("Question 9:  \n");
		Position[] poQuestion9 = {po1, po2, po3};
		for(Position position : poQuestion9) {
			System.out.println("position: " + position.id + " PositionName: " + position.name);
		}
		
		System.out.println("\n");
		
		// FOR
		// question 10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
		
		System.out.println("Question 10: \n");
		Account[] accQuestion10 = {ac1, ac2, ac3};
		for(int i = 0; i < accQuestion10.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accQuestion10[i].email);
			System.out.println("Full name: " + accQuestion10[i].fullName);
			System.out.println("Phòng ban: " + accQuestion10[i].department.name);
			System.out.println("\n");
		}
		System.out.println("\n");
		
		
		// question 11:
		Department[] deQuest11 = {dep1, dep2, dep3};
		for(int i = 0; i < deQuest11.length; i++) {
			System.out.println("Thông tin department thứ " + (i +1) +" là: ");
			System.out.println("ID: " + deQuest11[i].id);
			System.out.println("Name: " + deQuest11[i].name);
			System.out.println("\n");
		}
		System.out.println("\n");
		
		// question 12:
		// Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10

		System.out.println("Question 12: \n");
		
		
		Department[] deQuest12 = {dep1, dep2, dep3};
		for(int i = 0; i < deQuest12.length; i++) {
			if(i >= 2) {
				break;
			}else {
				System.out.println("Thông tin department thứ " + (i +1) +" là: ");
				System.out.println("ID: " + deQuest12[i].id);
				System.out.println("Name: " + deQuest12[i].name);
				System.out.println("\n");
			}
		}
		System.out.println("\n");
		
		// question 13:
		// In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("Question 13: \n");
		
		
		Account[] accQuestion13 = {ac1, ac2, ac3};
		for(int i = 0; i < accQuestion13.length; i++) {
			if(accQuestion13[i].id == 2) {
				continue;
			}else {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accQuestion13[i].email);
				System.out.println("Full name: " + accQuestion13[i].fullName);
				System.out.println("Phòng ban: " + accQuestion13[i].department.name);
				System.out.println("\n");
			}
		}
		System.out.println("\n");
		
		// question 14:
		// In ra thông tin tất cả các account có id < 4
		
		System.out.println("Question 14: \n");
		Account[] accQuestion14 = {ac1, ac2, ac3};
		for(int i = 0; i < accQuestion14.length; i++) {
			if(accQuestion14[i].id >= 4) {
				break;
			}else {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accQuestion14[i].email);
				System.out.println("Full name: " + accQuestion14[i].fullName);
				System.out.println("Phòng ban: " + accQuestion14[i].department.name);
				System.out.println("\n");
			}
		}
		System.out.println("\n");
		
		// question 15:
		// In ra các số chẵn nhỏ hơn hoặc bằng 20
		
		System.out.println("Question 15: \n");
		
		for(int i = 0; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println("\n");
		
		// WHILE
		// question 16:
		/*
		 * Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh
		 * break, continue
		 */
		
		// question 16.10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
		
		System.out.println("Question 16.10: \n");
		int i = 0;
		while(i < accQuestion10.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accQuestion10[i].email);
			System.out.println("Full name: " + accQuestion10[i].fullName);
			System.out.println("Phòng ban: " + accQuestion10[i].department.name);
			System.out.println("\n");
			i++;
		}
		System.out.println("\n");
		
		// question 16.11:
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing
		
		System.out.println("Question 16.11: \n");
		int j = 0;
		while (j < deQuest11.length) {
			System.out.println("Thông tin department thứ " + (j + 1) + " là: ");
			System.out.println("ID: " + deQuest11[j].id);
			System.out.println("Name: " + deQuest11[j].name);
			System.out.println("\n");
			j++;
		}
		System.out.println("\n");
		
		// question 16.12:
		// Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		System.out.println("Question 16.12: \n");
		int a = 0;
		while (a < 2) {
					System.out.println("Thông tin department thứ " + (a +1) +" là: ");
					System.out.println("ID: " + deQuest12[a].id);
					System.out.println("Name: " + deQuest12[a].name);
					System.out.println("\n");
					a++;
			}

		System.out.println("\n");
		
		// question 16.13:
		// In ra thông tin tất cả các account ngoại trừ account thứ 2

		System.out.println("Question 16.13: \n");
		int b = 0;
		while (b < accQuestion13.length) {
			if (b != 1) {
				System.out.println("Thông tin account thứ " + (b + 1) + " là: ");
				System.out.println("Email: " + accQuestion13[b].email);
				System.out.println("Full name: " + accQuestion13[b].fullName);
				System.out.println("Phòng ban: " + accQuestion13[b].department.name);
				System.out.println("\n");
			}
			b++;
		}
		System.out.println("\n");
		
		// question 16.14:
		// In ra thông tin tất cả các account có id < 4
		System.out.println("Question 16.14: \n");
		int i1 = 0;
		while(i1 < accQuestion14.length) {
			if(accQuestion14[i1].id >= 4) {
				break;
			}else {
					System.out.println("Thông tin account thứ " + (i1 + 1) + " là: ");
					System.out.println("Email: " + accQuestion14[i1].email);
					System.out.println("Full name: " + accQuestion14[i1].fullName);
					System.out.println("Phòng ban: " + accQuestion14[i1].department.name);
					System.out.println("\n");
			}
			i1++;
		}
		System.out.println("\n");
		
		// question 16.15:
		// In ra các số chẵn nhỏ hơn hoặc bằng 20
		
		System.out.println("Question 16.15: \n");
		int i2 = 0;
		while (i2 <= 20) {
			if(i2 % 2 == 0) {
				System.out.print(i2 + "\t");
			}
			i2++;
		}
		System.out.println("\n");
		
		
		// DO-WHILE
		// question17:
		// Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
		// lệnh break, continue
		// question 17.10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
		
		System.out.println("Question 17.10: \n");
		int j1 = 0;
		do {
			System.out.println("Thông tin account thứ " + (j1 + 1) + " là: ");
			System.out.println("Email: " + accQuestion10[j1].email);
			System.out.println("Full name: " + accQuestion10[j1].fullName);
			System.out.println("Phòng ban: " + accQuestion10[j1].department.name);
			System.out.println("\n");
			j1++;
		} while (j1 < accQuestion10.length);
		System.out.println("\n");
		 
		
		// question 17.11:
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//			Thông tin department thứ 1 là:
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là:
//			Id: 2
//			Name: Marketing
		
		System.out.println("Question 17.11: \n");
		int j2 = 0;
		do {
			System.out.println("Thông tin department thứ " + (j2 +1) +" là: ");
			System.out.println("ID: " + deQuest11[j2].id);
			System.out.println("Name: " + deQuest11[j2].name);
			System.out.println("\n");
			j2++;
		} while (j2 < deQuest11.length);
		System.out.println("\n");
		
		// question 17.12:
		// Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
		
		System.out.println("Question 17.12: \n");
		int j3 = 0;
		do {
			if(j3 >= 2) {
				break;
			}else {
				System.out.println("Thông tin department thứ " + (j3 +1) +" là: ");
				System.out.println("ID: " + deQuest12[j3].id);
				System.out.println("Name: " + deQuest12[j3].name);
				System.out.println("\n");
			}
			j3++;
		}while(j3 < deQuest12.length);
		System.out.println("\n");
		
		// question 17.13:
		// In ra thông tin tất cả các account ngoại trừ account thứ 2
		System.out.println("Question 17.13: \n");
		int j4 = 0;
		do {
			if(j4 != 1) {
				System.out.println("Thông tin account thứ " + (j4 + 1) + " là: ");
				System.out.println("Email: " + accQuestion13[j4].email);
				System.out.println("Full name: " + accQuestion13[j4].fullName);
				System.out.println("Phòng ban: " + accQuestion13[j4].department.name);
				System.out.println("\n");
				
			}
			j4++;
		}while(j4 < accQuestion13.length);
		System.out.println("\n");
		
		// question 17.14:
		// In ra thông tin tất cả các account có id < 4
		System.out.println("Question 17.14: \n");
		int j5 = 0;
		do {
			if(accQuestion14[j5].id >= 4) {
				break;
			}else {
				System.out.println("Thông tin account thứ " + (j5 + 1) + " là: ");
				System.out.println("Email: " + accQuestion14[j5].email);
				System.out.println("Full name: " + accQuestion14[j5].fullName);
				System.out.println("Phòng ban: " + accQuestion14[j5].department.name);
				System.out.println("\n");
			}
			j5++;
		}while(j5 < accQuestion14.length);
		System.out.println("\n");
		
		// question 17.15:
		// In ra các số chẵn nhỏ hơn hoặc bằng 20
		System.out.println("Question 17.15: \n");
		int j6 = 0;
		do {
			if(j6 % 2 == 0) {
				System.out.print(j6 + "\t");
			}
			j6++;
		} while(j6 <= 20);
		System.out.println("\n");
	}

}
