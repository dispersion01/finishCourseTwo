package com.any.finishcoursetwo.service;

import com.any.finishcoursetwo.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
