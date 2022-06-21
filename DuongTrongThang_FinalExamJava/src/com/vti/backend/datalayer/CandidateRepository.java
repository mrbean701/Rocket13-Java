package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCandidate.GraduationRank;
import com.vti.ultis.jdbcUltis;

public class CandidateRepository implements ICandidateRepository {
	private jdbcUltis jdbc;

	public CandidateRepository() throws FileNotFoundException, IOException {
		jdbc = new jdbcUltis();
	}

	@Override
	public boolean isCandidateIdExists(String email) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM Candidate c WHERE c.Email = ?";
		PreparedStatement preStatement = jdbc.createPreparedStatement(sql);
		preStatement.setNString(1, email);
		ResultSet result = preStatement.executeQuery();
		if (result.next()) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public boolean loginCandidate(String email, String password) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM Candidate c WHERE c.Email = ? AND c.password = ?;";
		PreparedStatement preStatement = jdbc.createPreparedStatement(sql);
		preStatement.setString(1, email);
		preStatement.setString(2, password);
		ResultSet result = preStatement.executeQuery();
		if (result.next()) {
			jdbc.disConnection();
			return true;

		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public boolean createExperienceCadidate(String firstName, String lastName, String phone, String email,
			String password, int expInYear, ProSkill proSkill) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO `candidate` (`FirstName`, `LastName`, `Phone`, `Email`, `password`, `expInYear`, `ProSkill`, 		`Category`) VALUES(?,			 ?, 		?, 			?, 		?, 			?,			 ?,	 'ExperienceCandidate');";
			
		PreparedStatement preStatement = jdbc.createPreparedStatement(sql);
		preStatement.setNString(1, firstName);
		preStatement.setNString(2, lastName);
		preStatement.setNString(3, phone);
		preStatement.setNString(4, email);
		preStatement.setString(5, password);
		preStatement.setInt(6, expInYear);
		preStatement.setNString(7, proSkill.toString());
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

	@Override
	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email,
			String password, GraduationRank graduationRank) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO `candidate` (`FirstName`, `LastName`, `Phone`, `Email`, `password`, `expInYear`, `ProSkill`, 		`Category`) VALUES(?,			 ?, 		?, 			?, 		?, 			?,			 ?,	 'ExperienceCandidate');";
		PreparedStatement preStatement = jdbc.createPreparedStatement(sql);
		preStatement.setNString(1, firstName);
		preStatement.setNString(2, lastName);
		preStatement.setNString(3, phone);
		preStatement.setNString(4, email);
		preStatement.setString(5, password);
		preStatement.setString(6, graduationRank.toString());
		int result = preStatement.executeUpdate();
		if (result == 1) {
			jdbc.disConnection();
			return true;
		} else {
			jdbc.disConnection();
			return false;
		}
	}

}
