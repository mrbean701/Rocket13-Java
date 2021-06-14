package com.vti.entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.ultis.jdbcUltis;

public class DepartmentDao {
	private jdbcUltis jdbc;

	public DepartmentDao() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
	}

	public List<Department> getListDepartment() throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM Department ORDER BY DepartmentID";
		ResultSet resultSet = jdbc.executeQuery(sql);

		List<Department> listDep = new ArrayList<Department>();
		while (resultSet.next()) {
			Department dep = new Department(resultSet.getInt("DepartmentID"), resultSet.getString("DepartmentName"));
			listDep.add(dep);
		}
		jdbc.disConnection();
		return listDep;
	}

	public Department getDepByID(int id) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM Department WHERE DepartmentID = ?";
		PreparedStatement preStatement = jdbc.createPreparedStatement(sql);
		preStatement.setInt(1, id);
		ResultSet result = preStatement.executeQuery();
		if (result.next()) {
			Department dep = new Department(result.getInt("DepartmentID"), result.getNString("DepartmentName"));
			return dep;
		} else {
			jdbc.disConnection();
			return null;
		}
	}

	public Boolean isDepartmentNameExist(String name) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM Department WHERE DepartmentName = ?";
		PreparedStatement preStatement = jdbc.createPreparedStatement(sql);
		preStatement.setNString(1, sql);
		ResultSet result = preStatement.executeQuery();

		if (result.next()) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}
	
	public boolean createDep(String name) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO Department (DepartmentName) VALUES (?);";
		PreparedStatement preStatement = jdbc.createPreparedStatement(sql);
		preStatement.setNString(1, sql);
		int result = preStatement.executeUpdate();
		if(result == 1) {
			jdbc.disConnection();
			return true;
		}else {
			jdbc.disConnection();
			return false;
		}
	}
}
