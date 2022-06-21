package com.vti.entity;

public class ExperienceCadidate extends Candidate {
	private int expInYear;
	private ProSkill proSkill;

	public enum ProSkill {
		DEV, TEST, JAVA, SQL
	}

	public ExperienceCadidate(String firstName, String lastName, String phone, String email, String password,
			Category category, int expInYear, ProSkill proSkill) {
		super(firstName, lastName, phone, email, password, category);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

}
