package com.pravin.hibernate;

import java.util.Set;

public class Question {
    private int qid;
    private String questin;
    private Set<Answer> answers;

    public int getQid() {
	return qid;
    }

    public void setQid(int qid) {
	this.qid = qid;
    }

    public String getQuestin() {
	return questin;
    }

    public void setQuestin(String questin) {
	this.questin = questin;
    }

    public Set<Answer> getAnswers() {
	return answers;
    }

    public void setAnswers(Set<Answer> answers) {
	this.answers = answers;
    }

}
