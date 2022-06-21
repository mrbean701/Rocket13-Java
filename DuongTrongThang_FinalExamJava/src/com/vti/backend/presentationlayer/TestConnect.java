package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.jdbcUltis;

public class TestConnect {
	private jdbcUltis jdbc;
	
	public TestConnect() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
	}
	public void testketnoi() throws ClassNotFoundException, SQLException {
		System.out.println("Test connnect");
		jdbc.connectionTestting();
	}
}
