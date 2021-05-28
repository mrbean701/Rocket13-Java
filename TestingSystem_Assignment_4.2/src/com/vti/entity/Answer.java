package com.vti.entity;

public class Answer {
	private int id;
	private String content;
	private Question questionID;
	private Boolean isCorrect;
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Question getQuestionID() {
		return questionID;
	}
	
	public void setQuestionID(Question questionID) {
		this.questionID = questionID;
	}
	
	public Boolean getIsCorrect() {
		return isCorrect;
	}
	
	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
}
