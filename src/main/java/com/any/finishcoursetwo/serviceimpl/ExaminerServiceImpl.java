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
    private final QuestionService questionServiceExaminer;

    public ExaminerServiceImpl(QuestionService questionServiceExaminer) {
        this.questionServiceExaminer = questionServiceExaminer;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> questionCollection = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            questionCollection.add(questionServiceExaminer.getRandomQuestion());
        }
        int a = 5;
        if (amount <= a) {
                        return questionCollection;
        } else {
            throw new TooLargeAmountQuestionException();
        }
/*        Collection<Question> questionCollection = new ArrayList<>();
        while (questionCollection.size()<amount){
            questionCollection.add(questionServiceExaminer.getRandomQuestion());
        }
        return questionCollection;
    */
    }
}
