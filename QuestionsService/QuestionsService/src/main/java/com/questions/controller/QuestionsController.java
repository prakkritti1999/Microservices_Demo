package com.questions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questions.entities.Questions;
import com.questions.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

	@Autowired QuestionService questionService;
	
	@GetMapping
	public List<Questions> getAllQuestions(){
		return questionService.getAllQuestions();
	}
	
	@PostMapping
	public Questions saveQuestions(@RequestBody Questions questions) {
		return questionService.saveQuestions(questions);
		
	}
	
	@GetMapping("/quiz/{quizId}")
	public List<Questions> getQuestionsOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsOfQuiz(quizId);
	}
	
}
