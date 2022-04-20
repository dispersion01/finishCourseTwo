package com.any.finishcoursetwo.serviceimpl;

import com.any.finishcoursetwo.exception.TooLargeAmountQuestionException;
import com.any.finishcoursetwo.model.Question;
import com.any.finishcoursetwo.service.QuestionService;
import org.springframework.stereotype.Service;
import com.any.finishcoursetwo.service.ExaminerService;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionServiceExaminer) {
        this.questionService = questionServiceExaminer;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> questionCollection = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            questionCollection.add(questionService.getRandomQuestion());
        }
//        int a = 5;
/*        if (amount <= questionCollection.size()) {
                        return questionCollection;
        } else {
            throw new TooLargeAmountQuestionException();
        }*/
//        Collection<Question> questionCollection = new ArrayList<>();
        while (amount > questionCollection.size()){
            throw new TooLargeAmountQuestionException();
        }
        return questionCollection;
    }
}
