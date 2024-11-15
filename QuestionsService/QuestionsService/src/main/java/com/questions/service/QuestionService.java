package com.questions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questions.entities.Questions;
import com.questions.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired QuestionRepository questionRepository;
	
	public Questions saveQuestions (Questions question) {
		return questionRepository.save(question); 
	}
	
	public List<Questions> getAllQuestions(){
		return questionRepository.findAll();
	}

	public List<Questions> getQuestionsOfQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(quizId);
	}
}
