package com.vti.ultis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcUltis {
	private Properties property;
	private Connection connection;
	
	public jdbcUltis() throws FileNotFoundException, IOException {
		property = new Properties();
		property.load(new FileInputStream("E:\\Rocket13\\Java\\Assignment\\FinalExam\\src\\com\\vti\\resource\\database.properties"));
	}
	
	public void connectionTestting() throws ClassNotFoundException, SQLException {
		String url = property.getProperty("url");
		String Username = property.getProperty("username");
		String password = property.getProperty("password");
		String dirver = property.getProperty("driver");
		
		Class.forName(dirver);
		connection = DriverManager.getConnection(url, Username, password);
		System.out.println("Connect Success");
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = property.getProperty("url");
		String Username = property.getProperty("username");
		String password = property.getProperty("password");
		String dirver = property.getProperty("driver");
		Class.forName(dirver);
		connection = DriverManager.getConnection(url, Username, password);
		return connection;
	}
	
	public void disConnection() throws SQLException {
		connection.close();
	}
	
	public ResultSet executeQuery(String sql) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		return result;
	}
	
	public PreparedStatement createPreparedStatement(String sql) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		PreparedStatement preStatement = connection.prepareStatement(sql);
		return preStatement;
	}

}
