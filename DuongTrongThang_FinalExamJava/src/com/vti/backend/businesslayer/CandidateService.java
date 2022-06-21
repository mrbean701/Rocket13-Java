package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.datalayer.CandidateRepository;
import com.vti.backend.datalayer.ICandidateRepository;
import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCandidate.GraduationRank;

public class CandidateService implements ICandidateService{
	private ICandidateRepository CandidateRepository;
	
	public CandidateService() throws FileNotFoundException, IOException {
		CandidateRepository = new CandidateRepository();
	}
	@Override
	public boolean isCandidateIdExists(String email) throws ClassNotFoundException, SQLException {
		return CandidateRepository.isCandidateIdExists(email);
	}

	@Override
	public boolean loginCandidate(String email, String password) throws ClassNotFoundException, SQLException {
		return CandidateRepository.loginCandidate(email, password);
	}

	@Override
	public boolean createExperienceCadidate(String firstName, String lastName, String phone, String email,
			String password, int expInYear, ProSkill proSkill) throws ClassNotFoundException, SQLException {
		return CandidateRepository.createExperienceCadidate(firstName, lastName, phone, email, password, expInYear, proSkill);
	}

	@Override
	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email,
			String password, GraduationRank graduationRank) throws ClassNotFoundException, SQLException {
		return CandidateRepository.createFresherCandidate(firstName, lastName, phone, email, password, graduationRank);
	}
	
}
