package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Hello VTI!!!");
		
		// create department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";
		
		
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";
		
		
		// create position
		Position po1 = new Position();
		po1.id = 1;
		po1.name = PositionName.Dev;
		
		Position po2 = new Position();
		po2.id = 2;
		po2.name = PositionName.PM ;
		
		
		// create group
		Group gr1 = new Group();
		gr1.id = 1;
		gr1.name = "Java Fresher";
		
		Group gr2 = new Group();
		gr2.id = 2;
		gr2.name = "C# Fresher";
		
		
		
		// create account
		Account ac1 = new Account();
		ac1.id = 1;
		ac1.email = "account1@gmail.com";
		ac1.userName = "ACC1";
		ac1.fullName = "Account 1";
		ac1.department = dep1;
		ac1.position = po1;
		ac1.createDate = LocalDate.of(2021, 01, 01);
		
		
		Account ac2 = new Account();
		ac2.id = 2;
		ac2.email = "account2@gmail.com";
		ac2.userName = "ACC2";
		ac2.fullName = "Account 2";
		ac2.department = dep2;
		ac2.position = po2;
		ac2.createDate = LocalDate.of(2020, 12, 12);
		
		
		
		System.out.println("Account 1");
		System.out.println("id: " + ac1.id);
		System.out.println("email: " + ac1.email);
		System.out.println("fullname: " + ac1.fullName);
		System.out.println("department: " + ac1.department.id);
		System.out.println("position: " + ac1.position.id);
		System.out.println("createdate: " + ac1.createDate);
		
		System.out.println("\n");
		
		System.out.println("Department 1");
		
	}

}
