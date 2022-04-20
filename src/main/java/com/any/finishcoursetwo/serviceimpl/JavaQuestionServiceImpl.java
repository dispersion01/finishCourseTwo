package com.any.finishcoursetwo.serviceimpl;

import com.any.finishcoursetwo.exception.QuestionExistsException;
import com.any.finishcoursetwo.model.Question;
import org.springframework.stereotype.Service;
import com.any.finishcoursetwo.service.QuestionService;

import javax.swing.*;
import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final Set<Question> questionSet = new HashSet<>();

    public JavaQuestionServiceImpl() {
    }

    private boolean getQuestionInSet(String question, String answer) {
        Question questionKey = new Question(question, answer);
        return questionSet.contains(questionKey);
    }

    @Override
    public Question add(String question, String answer) {
        Question addedQuestion = new Question(question, answer);
        if (!getQuestionInSet(question, answer)) {
            questionSet.add(addedQuestion);
            return addedQuestion;
        } else {
            throw new QuestionExistsException();
        }
    }


    @Override
    public Question remove(String question, String answer) {
        Question removedQuestion = new Question(question, answer);
        if (getQuestionInSet(question, answer)) {
            questionSet.remove(removedQuestion);
            return removedQuestion;
        } else {
            throw new QuestionExistsException("Вопрос уже удален");
        }
    }

    @Override
    public Collection<Question> getAll() {
        if (!questionSet.isEmpty()) {
            return questionSet;
        } else {
            throw new QuestionExistsException();
        }
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        List<Question> questionList = new ArrayList<>(questionSet);
        Question randomQuestion = questionList.get(random.nextInt(questionSet.size()));
        return randomQuestion;
    }
}
