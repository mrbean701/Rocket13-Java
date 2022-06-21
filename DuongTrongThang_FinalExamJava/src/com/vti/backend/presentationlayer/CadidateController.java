package com.vti.backend.presentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.businesslayer.CandidateService;
import com.vti.backend.businesslayer.ICandidateService;
import com.vti.entity.ExperienceCadidate.ProSkill;
import com.vti.entity.FresherCandidate.GraduationRank;
             
public class CadidateController {
	private ICandidateService candidateService;
	
	public CadidateController() throws FileNotFoundException, IOException {
		candidateService = new CandidateService();
	}
	
	public boolean createExperienceCandidate(String firstName, String lastName, String phone, String email, String password, int expInYear, ProSkill proSkill) throws ClassNotFoundException, SQLException {
		return candidateService.createExperienceCadidate(firstName, lastName, phone, email, password, expInYear, proSkill);
	}
	
	public boolean createFresherCandidate(String firstName, String lastName, String phone, String email, String password, GraduationRank graduationRank) throws ClassNotFoundException, SQLException {
		return candidateService.createFresherCandidate(firstName, lastName, phone, email, password, graduationRank);
	}
	
	public boolean isCandidateIdExists(String email) throws ClassNotFoundException, SQLException {
		return candidateService.isCandidateIdExists(email);
	}
	
	public boolean loginCandidate(String email, String password) throws ClassNotFoundException, SQLException {
		return candidateService.loginCandidate(email, password);
	}
}
