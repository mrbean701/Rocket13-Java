package com.vti.backend.businesslayer;

import java.sql.SQLException;

import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCandidate.GraduationRank;

public interface ICandidateService {
	public boolean isCandidateIdExists(String email) throws ClassNotFoundException, SQLException;

	public boolean loginCandidate(String email, String password) throws ClassNotFoundException, SQLException;

	public boolean createExperienceCadidate(String firstName, String lastName, String phone, String email,
			String password, int expInYear, ProSkill proSkill) throws ClassNotFoundException, SQLException;

	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email,
			String password, GraduationRank graduationRank) throws ClassNotFoundException, SQLException;
}
