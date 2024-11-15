package com.quiz.entities;

public class Question {

	public Question(Long questionId, String question, Long quizId) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.quizId = quizId;
	}
	
	private Long questionId;
	private String question;
	private Long quizId;
	
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}
}
