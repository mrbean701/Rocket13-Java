package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Engineer;
import com.vti.entity.Staff;
import com.vti.entity.Staff.Gender;
import com.vti.entity.Worker;

public class Exercise5 {
	private Scanner sc;
	private ArrayList<Staff> staffList;

	public Exercise5() {
		staffList = new ArrayList<Staff>();
		sc = new Scanner(System.in);
	}

	public void question1() {

	}

	public void question2() {
		menu();
	}

	public void menu() {
		while (true) {
			System.out.println("===========================================================================");
			System.out.println("======================Lựa chọn chức năng muốn sử dụng				 ======");
			System.out.println("===        			  1. Thêm mới cán bộ.            				 ======");
			System.out.println("===        			  2. Tìm kiếm theo họ tên.       				 ======");
			System.out.println("===        			  3. Hiển thị thông tin về danh sách các cán bộ. ======");
			System.out.println("===                   4. Nhập vào tên của cán bộ và delete cán bộ đó.======");
			System.out.println("===                   5. Thoát khỏi chương trình.    				 ======");
			System.out.println("===========================================================================");

			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				addStaff();
				break;
			case 2:
				findByName();
				break;
			case 3:
				printListStaff();
				break;
			case 4:
				deleteByName();
				break;
			case 5:
				// thoát khỏi chương trình
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}
	}

	// Thêm mới cán bộ
	private void addStaff() {
		// Chọn loại cán bộ cần thêm
		System.out.println("-------------------------------------------------------------------");
		System.out.println("----------------Lựa chọn chức năng bạn muốn sử dụng----------------");
		System.out.println("---             1. Thêm Engineer                    ---------------");
		System.out.println("---             2. Thêm Worker                      ---------------");
		System.out.println("---             3. Thêm Employee                    ---------------");
		System.out.println("-------------------------------------------------------------------");

		int choose1 = sc.nextInt();
		switch (choose1) {

		// Thêm Enginerr
		case 1: // Thêm các thuộc tính của Engineer
			System.out.println("Nhập vào tên Engineer: ");
			String nameEngineer = sc.next();
			System.out.println("Nhập vào tuổi Engineer: ");
			int ageEngineer = sc.nextInt();
			System.out.println("Nhập vào giới tính Engineer 1.Male, 2.Female, 3.Unknown: ");
			int flagEngineer = sc.nextInt();
			Gender genderName1 = null;
			switch (flagEngineer) {
			case 1:
				genderName1 = Gender.MALE;
				break;
			case 2:
				genderName1 = Gender.FEMALE;
				break;
			case 3:
				genderName1 = Gender.UNKNOWN;
				break;
			}

			System.out.println("Nhập vào địa chỉ Engineer: ");
			String addEngineer = sc.next();
			System.out.println("Nhập vào chuyên ngành Engineer: ");
			String specializedEngineer = sc.next();
			Staff engineer = new Engineer(nameEngineer, flagEngineer, genderName1, specializedEngineer);
			staffList.add(engineer);
			break;
		case 2:

			System.out.println("Nhập vào tên Worker: ");
			String nameWorker = sc.next();
			System.out.println("Nhập vào tuổi Workeer: ");
			int ageWorker = sc.nextInt();
			System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female, 3.Unknown: ");
			int flagGender = sc.nextInt();
			Gender genderName = null;
			switch (flagGender) {
			case 1:
				genderName = Gender.MALE;
				break;
			case 2:
				genderName = Gender.FEMALE;
				break;
			case 3:
				genderName = Gender.UNKNOWN;
				break;
			}
			System.out.println("Nhập vào địa chỉ Worker: ");
			String addWorker = sc.next();
			System.out.println("Nhập vào bậc Worker: ");
			int rankWorker = sc.nextInt();
			Staff worker1 = new Worker(nameWorker, ageWorker, genderName, addWorker);
			staffList.add(worker1);
			break;

		case 3:
			System.out.println("Nhập vào tên Employee: ");
			String nameEmployee = sc.next();
			System.out.println("Nhập vào tuổi Employee: ");
			int ageEmployee = sc.nextInt();
			System.out.println("Nhập vào giới tính Employee 1.Male, 2.Female, 3.Unknown: ");
			int flagEmployee = sc.nextInt();
			Gender genderEmployee = null;
			switch (flagEmployee) {
			case 1:
				genderEmployee = Gender.MALE;
				break;
			case 2:
				genderEmployee = Gender.FEMALE;
				break;
			case 3:
				genderEmployee = Gender.UNKNOWN;
				break;
			}
			System.out.println("Nhập vào địa chỉ Employee: ");
			String addEmployee = sc.next();
			System.out.println("Nhập vào nhiệm vụ Employee: ");
			String taskEmployee = sc.next();
			Staff Employee = new com.vti.entity.Employee(nameEmployee, flagEmployee, genderEmployee, taskEmployee);
			staffList.add(Employee);
			break;
		default:
			break;
		}
	}

	// Chức năm tìm bằng họ tên
	private void findByName() {
		System.out.println("Nhập tên cần xóa thông tin: ");
		String findName = sc.next();
		for (Staff staff : staffList) {
			if (staff.getName().equals(findName)) {
				System.out.println(staff);
			}
		}
	}

	// Hiện thị danh sách cán bộ
	private void printListStaff() {
		for (Staff staff : staffList) {
			System.out.println(staff);
		}
	}

	// Nhập vào tên của cán bộ và delete cán bộ đó
	private void deleteByName() {
		System.out.println("Nhập tên cần xóa thông tin: ");
		String delName = sc.next();
		staffList.removeIf(staff -> staff.getName().equals(delName));
		printListStaff();
	}

}
