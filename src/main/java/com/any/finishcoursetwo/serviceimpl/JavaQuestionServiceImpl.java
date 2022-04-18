package com.any.finishcoursetwo.serviceimpl;

import com.any.finishcoursetwo.exception.QuestionExistsException;
import com.any.finishcoursetwo.model.Question;
import org.springframework.stereotype.Service;
import com.any.finishcoursetwo.service.QuestionService;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final Set<Question> questionMap = new HashSet<>();

    public JavaQuestionServiceImpl() {
    }

    public boolean getQuestionInSet(String key) {

        return questionMap.contains(key);
    }

    @Override
    public Question add(String question, String answer) {
        Question addedQuestion = new Question(question, answer);
        String key = question + " " + answer;
        if (!getQuestionInSet(key)) {
            questionMap.add(addedQuestion);
            return addedQuestion;
        } else {
            throw new QuestionExistsException("Вопрос не добавлен в список");
        }
    }


    @Override
    public Question remove(String question, String answer) {
        Question removedQuestion = new Question(question, answer);
        String key = question + " " + answer;
        if (getQuestionInSet(key)) {
            questionMap.remove(key);
            return removedQuestion;
        } else {
            throw new QuestionExistsException("Нет в списке");
        }
    }

    @Override
    public Collection<Question> getAll() {
        if (!questionMap.isEmpty()) {
            return questionMap;
        } else {
            throw new QuestionExistsException();
        }
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        List<Question> questionList = new ArrayList<>(questionMap);
        Question randomQuestion = questionList.get(random.nextInt(questionMap.size()));
        return randomQuestion;
    }
}
