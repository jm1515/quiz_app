package com.quizzio.service.question;

import com.quizzio.model.entities.Question;
import com.quizzio.model.entities.Response;
import com.quizzio.model.repository.QuestionRepository;
import com.quizzio.model.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}
