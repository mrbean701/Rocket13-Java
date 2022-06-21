package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.presentationlayer.CadidateController;
import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCandidate.GraduationRank;
import com.vti.ultis.ScannerUltis;

public class Function {
	private CadidateController candidateController;

	public Function() throws FileNotFoundException, IOException {
		candidateController = new CadidateController();
	}

	private void inputExperienceCandidate() throws ClassNotFoundException, SQLException {
		String firstName, lastName, phone, password, email;
		int expInYear;
		System.out.println("Nhập vào FirstName: ");
		firstName = ScannerUltis.inputString();
		System.out.println("Nhập vào LastName: ");
		lastName = ScannerUltis.inputString();
		System.out.println("Nhập vào Phone: ");
		phone = ScannerUltis.inputPhoneNumber();
		System.out.println("Nhập vào email: ");
		email = ScannerUltis.inputEmail();

		System.out.println("Nhập vào password: ");
		password = ScannerUltis.inputPassword();
		System.out.println("Nhập vào expInYear");
		expInYear = ScannerUltis.inputIntPositive();
		System.out.println("Nhập vào ProSkill: ");
		ProSkill proSkill = getproSkill();
		boolean flag = candidateController.createExperienceCandidate(firstName, lastName, phone, email, password, expInYear, proSkill);
		if(flag) {
			System.out.println("Tạo tài khoản thành công");
			getLogin();
		}else {
			System.out.println("Tạo tài khoản không thành công vui lòng kiểm tra lại email hoặc password");
			return ;
		}
	}

	private void inputFresherCandidate() throws ClassNotFoundException, SQLException {
		String firstName, lastName, phone, password, email;
		System.out.println("Nhập vào FirstName: ");
		firstName = ScannerUltis.inputString();
		System.out.println("Nhập vào LastName: ");
		lastName = ScannerUltis.inputString();
		System.out.println("Nhập vào Phone: ");
		phone = ScannerUltis.inputPhoneNumber();
		System.out.println("Nhập vào email: ");
		email = ScannerUltis.inputEmail();

		System.out.println("Nhập vào password: ");
		password = ScannerUltis.inputPassword();
		System.out.println("Nhập vào GraduationRank");
		GraduationRank graduationRank = getGraduationRank();
		System.out.println("Nhập vào ProSkill: ");
		ProSkill proSkill = getproSkill();
		boolean flag = candidateController.createFresherCandidate(firstName, lastName, phone, email, password, graduationRank);
		if(flag) {
			System.out.println("Tạo tài khoản thành công");
			getLogin();
		}else {
			System.out.println("Tạo tài khoản không thành công vui lòng kiểm tra lại email hoặc password");
			return ;
		}
	}

	public void getRegister(String email) throws ClassNotFoundException, SQLException {
		while (true) {
			String leftAlignFormat = "| %-70s |%n";
			System.out.format("+========================================================================+%n");
			System.out.format("|                                 REGISTER                               |%n");
			System.out.format("+========================================================================+%n");
			System.out.format(leftAlignFormat, "1. Đăng ký ExperienceCandidate");
			System.out.format(leftAlignFormat, "2. Đăng ký FresherCandidate");
			System.out.format(leftAlignFormat, "3. Exit");
			System.out.format("+========================================================================+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:

				inputExperienceCandidate();
				if (candidateController.isCandidateIdExists(email)) {
					System.out.println("Tài khoản đã tồn tại!!!");
					break;
				}
			case 2:
				inputFresherCandidate();
				if(candidateController.isCandidateIdExists(email)) {
					System.out.println("Tài khoản đã tồn tại!!!");
					break;
				}
			}
		}
	}

	private ProSkill getproSkill() {
		while (true) {
			String leftAlignFormat = "| %-70s |%n";
			System.out.format("+========================================================================+%n");
			System.out.format("|                                 CHỌN PROSKILL                          |%n");
			System.out.format("+========================================================================+%n");
			System.out.format(leftAlignFormat, "1. DEV");
			System.out.format(leftAlignFormat, "2. JAVA");
			System.out.format(leftAlignFormat, "3. TEST");
			System.out.format(leftAlignFormat, "3. SQL");
			System.out.format("+========================================================================+%n");

			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				return ProSkill.DEV;
			case 2:
				return ProSkill.JAVA;
			case 3:
				return ProSkill.TEST;
			case 4:
				return ProSkill.SQL;
			default:
				System.out.println("Chọn từ 1-4");
				break;
			}
		}
	}
	
	private GraduationRank getGraduationRank() {
		while (true) {
			String leftAlignFormat = "| %-70s |%n";
			System.out.format("+========================================================================+%n");
			System.out.format("|                                 CHỌN PROSKILL                          |%n");
			System.out.format("+========================================================================+%n");
			System.out.format(leftAlignFormat, "1. EXCERLLENCE");
			System.out.format(leftAlignFormat, "2. GOOD");
			System.out.format(leftAlignFormat, "3. FAIR");
			System.out.format(leftAlignFormat, "3. POOR");
			System.out.format("+========================================================================+%n");

			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				return GraduationRank.EXCELLENCE;
			case 2:
				return GraduationRank.GOOD;
			case 3:
				return GraduationRank.FAIR;
			case 4:
				return GraduationRank.POOR;
			default:
				System.out.println("Chọn từ 1-4");
				break;
			}
		}
	}
	
	public void getLogin() throws ClassNotFoundException, SQLException {
		String email, password;
		System.out.format("+========================================================================+%n");
		System.out.format("|                                 LOGIN                                  |%n");
		System.out.format("+========================================================================+%n");
		System.out.println("Nhập vào Email: ");
		email = ScannerUltis.inputEmail();
		System.out.println("Nhập vào Password: ");
		password = ScannerUltis.inputPassword();
		if(candidateController.loginCandidate(email, password)) {
			System.out.println("Đăng nhập thành công!!!");
		}else {
			System.out.println("Đăng nhập không thành công vui lòng kiểm tra lại email hoặc password!!!");
			return;
		}
	}
}
