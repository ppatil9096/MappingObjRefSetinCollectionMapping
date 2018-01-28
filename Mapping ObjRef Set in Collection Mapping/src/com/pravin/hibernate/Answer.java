package com.pravin.hibernate;

public class Answer {
    private int aid;
    private String givenAnswer;
    private String submittedBy;

    public int getAid() {
	return aid;
    }

    public void setAid(int aid) {
	this.aid = aid;
    }

    public String getGivenAnswer() {
	return givenAnswer;
    }

    public void setGivenAnswer(String givenAnswer) {
	this.givenAnswer = givenAnswer;
    }

    public String getSubmittedBy() {
	return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
	this.submittedBy = submittedBy;
    }

}
