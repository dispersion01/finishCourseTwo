package com.any.finishcoursetwo.serviceimpl;

import com.any.finishcoursetwo.exception.QuestionExistsException;
import com.any.finishcoursetwo.model.Question;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;
import com.any.finishcoursetwo.service.QuestionService;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.range;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final Map<String, Question> questionMap = new HashMap<>();

    public JavaQuestionServiceImpl() {
    }

    public boolean getQuestionInSet(String key) {
        return questionMap.containsKey(key);
    }

    @Override
    public Question add(String question, String answer) {
        Question addedQuestion = new Question(question, answer);
        String key = question + " " + answer;
        if (!getQuestionInSet(key)) {
            questionMap.put(key, addedQuestion);
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
            return Collections.unmodifiableCollection(questionMap.values());
        } else {
            throw new QuestionExistsException("Список вопросов пуст");
        }
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        Question randomQuestion = questionMap.get(random.nextInt(questionMap.size()));
        return randomQuestion;
    }
}
