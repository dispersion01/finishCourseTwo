package com.any.finishcoursetwo.serviceimpl;

import com.any.finishcoursetwo.model.Question;
import com.any.finishcoursetwo.service.QuestionService;
import org.springframework.stereotype.Service;
import com.any.finishcoursetwo.service.ExaminerService;

import java.util.Collection;
import java.util.Collections;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
/*        while (int amount : questionService.getRandomQuestion()){
            return
        }*/
        for (int i = 0; i < amount; i++) {
         questionService.getRandomQuestion();
        }

        return Collections.unmodifiableCollection(questionService.values());
    }
}
