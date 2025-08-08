package com.wipro.siri.quizappmonorepo.services;



import java.util.List;

import com.wipro.siri.quizappmonorepo.entities.QuestionWrapper;
import com.wipro.siri.quizappmonorepo.entities.Quiz;
import com.wipro.siri.quizappmonorepo.entities.Response;


public interface QuizService  {

	 Quiz createQuiz(String category, String level, String title);

	 List<QuestionWrapper> getQuizQuestions(Integer id);

	 Integer calculateResult(int id, List<Response> response);
		

	
}
