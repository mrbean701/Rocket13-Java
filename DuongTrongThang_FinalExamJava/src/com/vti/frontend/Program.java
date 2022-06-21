package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.ScannerUltis;

public class Program {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Function function = new Function();
		
		while (true) {
			String leftAlignFormat = "| %-70s |%n";
			System.out.format("+========================================================================+%n");
			System.out.format("|                                 MENU                                   |%n");
			System.out.format("+========================================================================+%n");
			System.out.format(leftAlignFormat, "1. Login");
			System.out.format(leftAlignFormat, "2. Register");
			System.out.format(leftAlignFormat, "3. Exit");
			System.out.format("+========================================================================+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				function.getLogin();
				break;
			case 2:
				function.getRegister(leftAlignFormat);
				break;
			case 3:
				return;
			default:
				System.out.println("Nhập lựa chọn từ 1-3");
				break;
			}

		}
	}
}
