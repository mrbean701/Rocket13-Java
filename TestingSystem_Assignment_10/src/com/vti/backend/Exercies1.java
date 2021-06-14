package com.vti.backend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.ultis.ScannerUltis;
import com.vti.ultis.jdbcUltis;

public class Exercies1 {
	private jdbcUltis jdbc;

	public Exercies1() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
	}

	public void question1() throws ClassNotFoundException, SQLException {
		System.out.println("Test kết nối.");
		jdbc.connectionTestting();
	}

	public void question2() throws ClassNotFoundException, SQLException {

		String sql = "SELECT * FROM position;";
		ResultSet posResult = jdbc.executeQuery(sql);
		System.out.println("Thông tin Position đang có trên hệ thống: ");
		String leftAlignFormat = "| %-6d | %-21s | %n";

		System.out.format("+--------+-----------------------+%n");
		System.out.format("|   ID   | PositionName          |%n");
		System.out.format("+--------+-----------------------+%n");
		while (posResult.next()) {
			System.out.format(leftAlignFormat, posResult.getInt(1), posResult.getString(2));
		}
		System.out.format("+--------+-----------------------+%n");
	}

	public void question3() throws ClassNotFoundException, SQLException {
		System.out.println("Tạo Position mới.");
		String sql = "INSERT INTO position (PositionName) VALUES (?);";
		PreparedStatement preStatement = jdbc.createPreparedStatement(sql);
		System.out.println("Chọn Position cần tạo 1.Dev, 2.Test, 3.Scrum Master, 4.PM: ");
		String name = getName();
		preStatement.setString(1, name);
		if(preStatement.executeUpdate() == 1) {
			System.out.println("Tạo thành công");
			question2();
		}else {
			System.out.println("Đã có lỗi xảy ra");
		}
	}

	private String getName() {
		while (true) {
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				return "Dev";
			case 2:
				return "Test";
			case 3:
				return "Scrum Master";
			case 4:
				return "PM";
			default:
				System.out.println("Nhập lại");
				break;
			}
		}
	}
}
