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
		 * Ki???m tra account th??? 2 N???u kh??ng c?? ph??ng ban (t???c l?? department == null) th??
		 * s??? in ra text "Nh??n vi??n n??y ch??a c?? ph??ng ban" N???u kh??ng th?? s??? in ra text
		 * "Ph??ng ban c???a nh??n vi??n n??y l?? ???" + "" + "
		 */		
		
		System.out.println("Question 1: \n");
		if(ac2.department == null) {
			System.out.println("Nh??n vi??n n??y ch??a c?? ph??ng ban");
		}else {
			System.out.println("ph??ng ban c???a nh??n vi??n n??y l??: " + ac2.department.name);
		}
		System.out.println("\n");
		
		
		// question2:
		/*
		 * Ki???m tra account th??? 2 N???u kh??ng c?? group th?? s??? in ra text
		 * "Nh??n vi??n n??y ch??a c?? group" N???u c?? m???t trong 1 ho???c 2 group th?? s??? in ra
		 * text "Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher" N???u c?? m???t trong 3
		 * Group th?? s??? in ra text "Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u
		 * group" N???u c?? m???t trong 4 group tr??? l??n th?? s??? in ra text "Nh??n vi??n n??y l??
		 * ng?????i h??ng chuy???n, tham gia t???t c??? c??c group"
		 */		
		
		System.out.println("Question 2: \n" );
		if (ac2.groups == null) {
			System.out.println("Nh??n vi??n n??y ch??a c?? group");
		}else {
			int countGroup = ac2.groups.length;
			if(countGroup == 1 || countGroup == 2) {
				System.out.println("Group c???a nh??n vi??n n??y l?? Java, C# Fresher");
			}else if(countGroup == 3){
				System.out.println("Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u group");
				
			}else if(countGroup >= 4) {
				System.out.println("Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");
			}
		}
		System.out.println("\n");
		
		
		// question3:
		// S??? d???ng to??n t??? ternary ????? l??m Question 1
		
		
		System.out.println("question3: \n");
		System.out.println(ac2.department == null ? "Nh??n vi??n n??y ch??a c?? ph??ng ban" : "Ph??ng ban c???a nh??n vi??n n??y l??: " + ac2.department.name);
		
		System.out.println("\n");
		
		// question4 :
		/*
		 * S??? d???ng to??n t??? ternary ????? l??m y??u c???u sau: Ki???m tra Position c???a account th???
		 * 1 N???u Position = Dev th?? in ra text "????y l?? Developer" N???u kh??ng ph???i th?? in
		 * ra text "Ng?????i n??y kh??ng ph???i l?? Developer"
		 */
		
		System.out.println("Question4: \n" );
		System.out.println(ac1.position.name == positionName.Dev ? "????y l?? Developer" : "Ng?????i n??y kh??ng ph???i l?? Developer");
		System.out.println("\n");
		
		// SWITCH CASE
		// question5 :
		/*
		 * L???y ra s??? l?????ng account trong nh??m th??? 1 v?? in ra theo format sau: N???u s???
		 * l?????ng account = 1 th?? in ra "Nh??m c?? m???t th??nh vi??n" N???u s??? l?????ng account = 2
		 * th?? in ra "Nh??m c?? hai th??nh vi??n" N???u s??? l?????ng account = 3 th?? in ra
		 * "Nh??m c?? ba th??nh vi??n" C??n l???i in ra "Nh??m c?? nhi???u th??nh vi??n"
		 */
		
		System.out.println("Question5: \n");
		int countQuestion5 = gr1.accounts.length;
		if(gr1.accounts == null) {
			System.out.println("Group ch??a c?? th??nh vi??n n??o tham gia");
		}else {
			switch (countQuestion5) {
			case 1:
				System.out.println("Nh??m c?? 1 th??nh vi??n");
				break;
			case 2:
				System.out.println("Nh??m c?? 2 th??nh vi??n");
				break;
			case 3:
				System.out.println("Nh??m c?? 3 th??nh vi??n");
				break;
			default:
				System.out.println("Nh??m c?? nhi???u th??nh vi??n");
				break;
			}
		}
		
		System.out.println("\n");
		
		// question6 :
		//S??? d???ng switch case ????? l??m l???i Question 2
		
		System.out.println("Question 6: \n");
		int countQuestion6 = ac2.groups.length;
		if(ac2.groups == null) {
			System.out.println("Nh??n vi??n n??y ch??a c?? group");
		}else {
			switch(countQuestion6) {
			case 1:
				System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
				break;
			case 2:
				System.out.println("Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u group");
				break;
			default:
				System.out.println("Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");
				break;
			}
			System.out.println("\n");
		}
		// question 7:
		// S??? d???ng switch case ????? l??m l???i question 4
		System.out.println("Question 7: \n");
		
		String countQuestion7 = ac1.position.name.toString();
		if(countQuestion7 == null) {
			System.out.println("Ng?????i n??y ch??a c?? position");
		}else {
			switch(countQuestion7) {
			case "Dev":
				System.out.println("????y l?? Developer");
				break;
			default :
				System.out.println("Ng?????i n??y kh??ng ph???i Developer");
				break;
			}
		}
		System.out.println("\n");
		
		
		// FOREACH
		// question 8:
		/*
		 * In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a h???
		 */
		
		System.out.println("Question 8: \n");
		
		Account[] accQuestion8 = {ac1, ac2, ac3};
		for(Account account : accQuestion8) {
			System.out.println("AcocuntID: " + account.id + " Email: " + account.email + " FullName: " + account.fullName + " Position: " + account.position.name);
		}
		
		System.out.println("\n");
		
		// question 9:
		// In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name
		
		System.out.println("Question 9:  \n");
		Position[] poQuestion9 = {po1, po2, po3};
		for(Position position : poQuestion9) {
			System.out.println("position: " + position.id + " PositionName: " + position.name);
		}
		
		System.out.println("\n");
		
		// FOR
		// question 10:
//		In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a
//		h??? theo ?????nh d???ng nh?? sau:
//		Th??ng tin account th??? 1 l??:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguy???n V??n A
//		Ph??ng ban: Sale
//		Th??ng tin account th??? 2 l??:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguy???n V??n B
		
		System.out.println("Question 10: \n");
		Account[] accQuestion10 = {ac1, ac2, ac3};
		for(int i = 0; i < accQuestion10.length; i++) {
			System.out.println("Th??ng tin account th??? " + (i + 1) + " l??: ");
			System.out.println("Email: " + accQuestion10[i].email);
			System.out.println("Full name: " + accQuestion10[i].fullName);
			System.out.println("Ph??ng ban: " + accQuestion10[i].department.name);
			System.out.println("\n");
		}
		System.out.println("\n");
		
		
		// question 11:
		Department[] deQuest11 = {dep1, dep2, dep3};
		for(int i = 0; i < deQuest11.length; i++) {
			System.out.println("Th??ng tin department th??? " + (i +1) +" l??: ");
			System.out.println("ID: " + deQuest11[i].id);
			System.out.println("Name: " + deQuest11[i].name);
			System.out.println("\n");
		}
		System.out.println("\n");
		
		// question 12:
		// Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng nh?? Question 10

		System.out.println("Question 12: \n");
		
		
		Department[] deQuest12 = {dep1, dep2, dep3};
		for(int i = 0; i < deQuest12.length; i++) {
			if(i >= 2) {
				break;
			}else {
				System.out.println("Th??ng tin department th??? " + (i +1) +" l??: ");
				System.out.println("ID: " + deQuest12[i].id);
				System.out.println("Name: " + deQuest12[i].name);
				System.out.println("\n");
			}
		}
		System.out.println("\n");
		
		// question 13:
		// In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2
		System.out.println("Question 13: \n");
		
		
		Account[] accQuestion13 = {ac1, ac2, ac3};
		for(int i = 0; i < accQuestion13.length; i++) {
			if(accQuestion13[i].id == 2) {
				continue;
			}else {
				System.out.println("Th??ng tin account th??? " + (i + 1) + " l??: ");
				System.out.println("Email: " + accQuestion13[i].email);
				System.out.println("Full name: " + accQuestion13[i].fullName);
				System.out.println("Ph??ng ban: " + accQuestion13[i].department.name);
				System.out.println("\n");
			}
		}
		System.out.println("\n");
		
		// question 14:
		// In ra th??ng tin t???t c??? c??c account c?? id < 4
		
		System.out.println("Question 14: \n");
		Account[] accQuestion14 = {ac1, ac2, ac3};
		for(int i = 0; i < accQuestion14.length; i++) {
			if(accQuestion14[i].id >= 4) {
				break;
			}else {
				System.out.println("Th??ng tin account th??? " + (i + 1) + " l??: ");
				System.out.println("Email: " + accQuestion14[i].email);
				System.out.println("Full name: " + accQuestion14[i].fullName);
				System.out.println("Ph??ng ban: " + accQuestion14[i].department.name);
				System.out.println("\n");
			}
		}
		System.out.println("\n");
		
		// question 15:
		// In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20
		
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
		 * L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng WHILE k???t h???p v???i l???nh
		 * break, continue
		 */
		
		// question 16.10:
//		In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a
//		h??? theo ?????nh d???ng nh?? sau:
//		Th??ng tin account th??? 1 l??:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguy???n V??n A
//		Ph??ng ban: Sale
//		Th??ng tin account th??? 2 l??:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguy???n V??n B
//		Ph??ng ban: Marketting
		
		System.out.println("Question 16.10: \n");
		int i = 0;
		while(i < accQuestion10.length) {
			System.out.println("Th??ng tin account th??? " + (i + 1) + " l??: ");
			System.out.println("Email: " + accQuestion10[i].email);
			System.out.println("Full name: " + accQuestion10[i].fullName);
			System.out.println("Ph??ng ban: " + accQuestion10[i].department.name);
			System.out.println("\n");
			i++;
		}
		System.out.println("\n");
		
		// question 16.11:
//		In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng sau:
//			Th??ng tin department th??? 1 l??:
//			Id: 1
//			Name: Sale
//			Th??ng tin department th??? 2 l??:
//			Id: 2
//			Name: Marketing
		
		System.out.println("Question 16.11: \n");
		int j = 0;
		while (j < deQuest11.length) {
			System.out.println("Th??ng tin department th??? " + (j + 1) + " l??: ");
			System.out.println("ID: " + deQuest11[j].id);
			System.out.println("Name: " + deQuest11[j].name);
			System.out.println("\n");
			j++;
		}
		System.out.println("\n");
		
		// question 16.12:
		// Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng nh?? Question 10
		System.out.println("Question 16.12: \n");
		int a = 0;
		while (a < 2) {
					System.out.println("Th??ng tin department th??? " + (a +1) +" l??: ");
					System.out.println("ID: " + deQuest12[a].id);
					System.out.println("Name: " + deQuest12[a].name);
					System.out.println("\n");
					a++;
			}

		System.out.println("\n");
		
		// question 16.13:
		// In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2

		System.out.println("Question 16.13: \n");
		int b = 0;
		while (b < accQuestion13.length) {
			if (b != 1) {
				System.out.println("Th??ng tin account th??? " + (b + 1) + " l??: ");
				System.out.println("Email: " + accQuestion13[b].email);
				System.out.println("Full name: " + accQuestion13[b].fullName);
				System.out.println("Ph??ng ban: " + accQuestion13[b].department.name);
				System.out.println("\n");
			}
			b++;
		}
		System.out.println("\n");
		
		// question 16.14:
		// In ra th??ng tin t???t c??? c??c account c?? id < 4
		System.out.println("Question 16.14: \n");
		int i1 = 0;
		while(i1 < accQuestion14.length) {
			if(accQuestion14[i1].id >= 4) {
				break;
			}else {
					System.out.println("Th??ng tin account th??? " + (i1 + 1) + " l??: ");
					System.out.println("Email: " + accQuestion14[i1].email);
					System.out.println("Full name: " + accQuestion14[i1].fullName);
					System.out.println("Ph??ng ban: " + accQuestion14[i1].department.name);
					System.out.println("\n");
			}
			i1++;
		}
		System.out.println("\n");
		
		// question 16.15:
		// In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20
		
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
		// L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng DO-WHILE k???t h???p v???i
		// l???nh break, continue
		// question 17.10:
//		In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a
//		h??? theo ?????nh d???ng nh?? sau:
//		Th??ng tin account th??? 1 l??:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguy???n V??n A
//		Ph??ng ban: Sale
//		Th??ng tin account th??? 2 l??:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguy???n V??n B
//		Ph??ng ban: Marketting
		
		System.out.println("Question 17.10: \n");
		int j1 = 0;
		do {
			System.out.println("Th??ng tin account th??? " + (j1 + 1) + " l??: ");
			System.out.println("Email: " + accQuestion10[j1].email);
			System.out.println("Full name: " + accQuestion10[j1].fullName);
			System.out.println("Ph??ng ban: " + accQuestion10[j1].department.name);
			System.out.println("\n");
			j1++;
		} while (j1 < accQuestion10.length);
		System.out.println("\n");
		 
		
		// question 17.11:
//		In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng sau:
//			Th??ng tin department th??? 1 l??:
//			Id: 1
//			Name: Sale
//			Th??ng tin department th??? 2 l??:
//			Id: 2
//			Name: Marketing
		
		System.out.println("Question 17.11: \n");
		int j2 = 0;
		do {
			System.out.println("Th??ng tin department th??? " + (j2 +1) +" l??: ");
			System.out.println("ID: " + deQuest11[j2].id);
			System.out.println("Name: " + deQuest11[j2].name);
			System.out.println("\n");
			j2++;
		} while (j2 < deQuest11.length);
		System.out.println("\n");
		
		// question 17.12:
		// Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng nh?? Question 10
		
		System.out.println("Question 17.12: \n");
		int j3 = 0;
		do {
			if(j3 >= 2) {
				break;
			}else {
				System.out.println("Th??ng tin department th??? " + (j3 +1) +" l??: ");
				System.out.println("ID: " + deQuest12[j3].id);
				System.out.println("Name: " + deQuest12[j3].name);
				System.out.println("\n");
			}
			j3++;
		}while(j3 < deQuest12.length);
		System.out.println("\n");
		
		// question 17.13:
		// In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2
		System.out.println("Question 17.13: \n");
		int j4 = 0;
		do {
			if(j4 != 1) {
				System.out.println("Th??ng tin account th??? " + (j4 + 1) + " l??: ");
				System.out.println("Email: " + accQuestion13[j4].email);
				System.out.println("Full name: " + accQuestion13[j4].fullName);
				System.out.println("Ph??ng ban: " + accQuestion13[j4].department.name);
				System.out.println("\n");
				
			}
			j4++;
		}while(j4 < accQuestion13.length);
		System.out.println("\n");
		
		// question 17.14:
		// In ra th??ng tin t???t c??? c??c account c?? id < 4
		System.out.println("Question 17.14: \n");
		int j5 = 0;
		do {
			if(accQuestion14[j5].id >= 4) {
				break;
			}else {
				System.out.println("Th??ng tin account th??? " + (j5 + 1) + " l??: ");
				System.out.println("Email: " + accQuestion14[j5].email);
				System.out.println("Full name: " + accQuestion14[j5].fullName);
				System.out.println("Ph??ng ban: " + accQuestion14[j5].department.name);
				System.out.println("\n");
			}
			j5++;
		}while(j5 < accQuestion14.length);
		System.out.println("\n");
		
		// question 17.15:
		// In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20
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
