package com.questions.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questions.entities.Questions;

public interface QuestionRepository extends JpaRepository<Questions, Long> {
	List<Questions> findByQuizId(Long quizId);
	
}
