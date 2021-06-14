package com.vti.backend;

import java.util.Iterator;

import com.vti.entity.MyMath;
import com.vti.entity.Student;
import com.vti.ultis.ScannerUltis;

public class Exercise1 {
	public void Question1() {
//		Khai báo 1 class student có các thuộc tính id, name, college
//		Với college là static variable.
//		Hãy khởi tạo các student sau:
//		Student có id = 1, name ="Nguyễn Văn A"
//		Student có id = 2, name = " Nguyễn Văn B "
//		Student có id = 3, name = " Nguyễn Văn C "
//		Và tất cả các student này đều học ở "Đại học bách khoa".
//		Dùng vòng for để in ra thông tin các student
//		Sau đó hãy chuyển các student này sang "Đại học công nghệ"
//		Dùng vòng for để in ra thông tin các student

		System.out.println("Question1: ");
		Student[] studentArray = new Student[3];

		// Khởi tạo các Student
		System.out.println("Khởi tạo 3 sinh viên");
		for (int i = 0; i < 3; i++) {
			System.out.println("Sinh viên " + (i + 1 + ":"));
			Student st = new Student();
			studentArray[i] = st;
		}
		System.out.println("\n");

		// Dùng vòng for để in ra thông tin các sinh viên
		System.out.println("Thông tin các sinh viên vừa nhập: ");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}

		System.out.println("\n");

		// Chuyển các sinh viên sang "Đại học Công nghệ" bằng collect
		System.out.println("Chuyển các sinh viên sang Đại học Công nghệ: ");
		Student.collect = "Đại học Công nghệ";
		// In các thông tin các sinh viên sau khi chuyển
		System.out.println("Thông tin sinh viên sau khi chuyển ");
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}
		System.out.println("\n");

	}

	public void Question2() {
//		Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ
//				lớp - dùng chung cho tất cả các student).
//				Hãy viết chương trình main() để mô tả các bước sau:
//				B1: Các Student sẽ nộp quỹ, mỗi Student 100k
//				B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
//				B3: Student thứ 2 lấy 20k đi mua bánh mì
//				B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
//				B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
//				In ra số tiền còn của nhóm tại mỗi bước

		System.out.println("Question2: ");
		Student[] studentArray = new Student[3];
		System.out.println("Khởi tạo 3 sinh viên");
		System.out.println("\n");
		for (int i = 0; i < 3; i++) {
			System.out.println("Sinh viên" + (i + 1 + ":"));
			Student st = new Student();
			studentArray[i] = st;
		}

		System.out.println("Các sinh viên nộp quỹ, mỗi bạn 100k: ");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup += 300));
		System.out.println("Student thứ 1 lấy đi 50k đi mua bim bim, kẹo về liên hoan: ");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 50));
		System.out.println("Student thứ 2 lấy đi 20k đi mua bánh mì: ");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 20));
		System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm: ");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup -= 150));
		System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k: ");
		System.out.println("Tổng quỹ: " + (Student.moneyGroup += 150));
		System.out.println("\n");
	}

	public void Question3() {
//		a) Viết class MyMath để thay thế cho class Math của java.
//		b) Viết thêm method min(), sum vào class MyMath

		System.out.println("Question3: ");
		int a, b;
		System.out.println("Nhập vào số int 1: ");
		a = ScannerUltis.inputInt();
		System.out.println("Nhập vào số int 2: ");
		b = ScannerUltis.inputInt();

		// In ra kết quả các phép tính
		System.out.println("Max a và b: " + MyMath.max(a, b));
		System.out.println("Min a và b: " + MyMath.min(a, b));
		System.out.println("Sum a và b: " + MyMath.sum(a, b));
		System.out.println("\n");
	}

	public void Question4() {
//		Trong class Student
//		a) Viết method cho phép thay đổi college
//		b) Viết method cho phép lấy giá trị của college

		System.out.println("Question4: ");
		System.out.println("Demo Get Set Collect: ");
		Student st = new Student();
		System.out.println("Collect là: " + st.getCollect());
		System.out.println("Thay đổi Collect: Đại học Hà Nội");
		st.setCollect("Đại học Hà Nội");
		System.out.println("Collect là: " + st.getCollect());
		System.out.println("\n");
	}
}
