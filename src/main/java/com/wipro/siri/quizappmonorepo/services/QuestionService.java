package com.wipro.siri.quizappmonorepo.services;

import java.util.List;

import com.wipro.siri.quizappmonorepo.entities.Question;

public interface QuestionService {

	Question save(Question question);
	
	Question getQuestionById(Long id);

	List<Question> findAllQuestion();
	
	Question updateQuestionById(Long id, Question question);
	
	void deletQuestion(Long id);
}
