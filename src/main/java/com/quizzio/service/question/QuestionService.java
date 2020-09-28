package com.quizzio.service.question;

import com.quizzio.model.entities.Question;
import com.quizzio.model.entities.Response;

import java.util.List;

public interface QuestionService {
    List<Question> getAllQuestions();
}
