package com.vti.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vti.entity.Student;
import com.vti.ultis.ScannerUltis;

public class Exercise1 {
	private java.util.List<Student> listStudent;

	public Exercise1() {
		System.out.println("Question1: ");
		// Khai báo 1 ArrayList students

		listStudent = new ArrayList<Student>();
		System.out.println("Nhập số sinh viên muốn thêm: ");

		int num = ScannerUltis.inputIntPositive();
		for (int i = 0; i < num - 3; i++) {
			Student st = new Student("Student " + (i + 1));
			listStudent.add(st);
		}

		// Khởi tạo 3 đối tượng Student có tên giống nhau
		Student st1 = new Student("Student Name");
		Student st2 = new Student("Student Name");
		Student st3 = new Student("Student Name");

		// Thêm các đối tượng vào list
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);

	}

	public void Question1() {
//		Tạo 1 student có property id, name (trong đó có 3 student có name
//				trùng nhau, id sẽ là auto increment)
//				Khai báo 1 ArrayList students, sau đó
//				a) In ra tổng số phần tử của students
//				b) Lấy phần tử thứ 4 của students
//				c) In ra phần tử đầu và phần tử cuối của students
//				d) Thêm 1 phần tử vào vị trí đầu của students
//				e) Thêm 1 phần tử vào vị trí cuối của students
//				f) Đảo ngược vị trí của students
//				g) Tạo 1 method tìm kiếm student theo id
//				h) Tạo 1 method tìm kiếm student theo name
//				i) Tạo 1 method để in ra các student có trùng tên
//				j) Xóa name của student có id = 2;
//				k) Delete student có id = 5;
//				l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
//				studentCopies

		while (true) {
			loadMenuQues1();
			int chose = ScannerUltis.inputInt();
			switch (chose) {
			case 1:
				choseCase1();
				System.out.println("\n");
				break;

			case 2:
				choseCase2();
				System.out.println("\n");
				break;

			case 3:
				choseCase3();
				System.out.println("\n");
				break;

			case 4:

				choseCase4();
				System.out.println("\n");
				break;

			case 5:
				choseCase5();
				System.out.println("\n");
				break;

			case 6:
				choseCase6();
				System.out.println("\n");
				break;

			case 7:
				choseCase7();
				System.out.println("\n");
				break;

			case 8:
				choseCase8();
				System.out.println("\n");
				break;

			case 9:
				choseCase9();
				System.out.println("\n");
				break;

			case 10:
				choseCase10();
				System.out.println("\n");
				break;

			case 11:
				choseCase11();
				System.out.println("\n");
				break;

			case 12:
				choseCase12();
				System.out.println("\n");
				break;

//				Exit
			case 13:
				return;

			default:
				System.out.println("Chọn từ 1 - 13 ");
				System.out.println("\n");
				break;
			}
		}
	}

	// Menu chức năng
	private void loadMenuQues1() {
		System.out.println("================= Lựa chọn chức năng muốn sử dụng ===============================");
		System.out.println("===               1. In ra tổng số phần tử của students                       ===");
		System.out.println("===               2. Lấy phần tử thứ 4 của students                           ===");
		System.out.println("===               3. In ra phần từ đầu và phần tử cuối của students           ===");
		System.out.println("===               4. Thêm 1 phần tử vào vị trí đầu của students               ===");
		System.out.println("===               5. Thêm 1 phần tử vào vị trí cuối của students              ===");
		System.out.println("===               6. Đảo ngược vị trí của students                            ===");
		System.out.println("===               7. Tìm kiếm student theo id                                 ===");
		System.out.println("===               8. Tìm kiếm student theo name                               ===");
		System.out.println("===               9. In ra các student có trùng tên                           ===");
		System.out.println("===               10.Xóa name của student có id = 2                           ===");
		System.out.println("===               11.Delete student có id = 5                                 ===");
		System.out.println("===               12.Tạo 1 ArrayList tên là student studentCopies và add tất  ===");
		System.out.println("===                  tất cả students vào studentCopies                        ===");
		System.out.println("===               13.Exit                                                     ===");
		System.out.println("=================================================================================");

	}

	// In ra tổng số student
	private void printStudent() {
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}

	private void choseCase1() {
//		a) In ra tổng số phần tử của students
		System.out.println("Tổng số các sinh viên là: " + listStudent.size());
	}

	private void choseCase2() {
//		b) Lấy phần tử thứ 4 của students
		System.out.println("Phần tử thứ 4 là: " + listStudent.get(3));
	}

	private void choseCase3() {
//		c) In ra phần tử đầu và phần tử cuối của students
		System.out.println("Phần tử đầu là: " + listStudent.get(0));
		System.out.println("Phần tử cuối là: " + listStudent.get(listStudent.size() - 1));
	}

	private void choseCase4() {
//		d) Thêm 1 phần tử vào vị trí đầu của students

			// Khởi tạo 1 đối tượng Student mới
			System.out.println("Nhập tên của sinh viên cần thêm: ");
			String name1 = ScannerUltis.inputString();
			listStudent.add(0, new Student(name1));
			printStudent();
	}

	private void choseCase5() {
//		e) Thêm 1 phần tử vào vị trí cuối của students 

		System.out.println("Nhập tên của sinh viên cần thêm: ");
		String name5 = ScannerUltis.inputString();
		listStudent.add(new Student(name5));
		printStudent();
	}

	private void choseCase6() {
//		f) Đảo ngược vị trí của students

		// dùng phương thức reverse để đảo ngược list
		Collections.reverse(listStudent);
		System.out.println("Đã đảo ngược vị trí: ");
		printStudent();
	}

	private void choseCase7() {
//		g) Tạo 1 method tìm kiếm student theo id

		System.out.println("Nhập vào ID cần tìm kiếm: ");
		int id7 = ScannerUltis.inputIntPositive();
		for (Student student : listStudent) {
			if (student.getId() == id7) {
				System.out.println(student);
			}
		}
	}

	private void choseCase8() {
//		h) Tạo 1 method tìm kiếm student theo name

		System.out.println("Nhập vào name cần tìm kiếm: ");
		String name8 = ScannerUltis.inputString();
		for (Student student : listStudent) {
			if (student.getName() == name8) {
				System.out.println(student);
			}
		}
	}

	private void choseCase9() {
//		i) Tạo 1 method để in ra các student có trùng tên

		System.out.println("Các sinh viên có trùng tên: ");
		for (int i = 0; i < listStudent.size(); i++) {
			for (int j = i + 1; j < listStudent.size(); j++) {
				if (listStudent.get(i).getName().equals(listStudent.get(j).getName())) {
					System.out.println(listStudent.get(i).toString());
				}
			}
		}
	}

	private void choseCase10() {
//		j) Xóa name của student có id = 2;

		System.out.println("Nhập vào ID cần xóa tên: ");
		int id10 = ScannerUltis.inputIntPositive();
		for (Student student : listStudent) {
			if (student.getId() == id10) {
				student.setName(null);
			}
		}
	}

	private void choseCase11() {
//		k) Delete student có id = 5;

		System.out.println("Nhập vào ID của student cần xóa: ");
		int id11 = ScannerUltis.inputIntPositive();
		listStudent.removeIf(student -> student.getId() == id11);
		printStudent();
	}

	private void choseCase12() {
//		l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
//		studentCopies
		System.out.println("Tạo mới studentCopies: ");
		List<Student> studentCopies = new ArrayList<Student>();
		studentCopies.addAll(listStudent);
		System.out.println("In phần tử trong studentCopies: ");
		for (Student student : studentCopies) {
			System.out.println(student);
		}
	}
}
