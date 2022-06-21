package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.presentationlayer.TestConnect;

public class Demo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		TestConnect test = new TestConnect();
		test.testketnoi();
	}
}
