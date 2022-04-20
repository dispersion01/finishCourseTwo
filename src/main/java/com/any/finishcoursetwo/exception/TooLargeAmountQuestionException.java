package com.any.finishcoursetwo.exception;

import com.any.finishcoursetwo.service.ExaminerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TooLargeAmountQuestionException extends RuntimeException {
    private static final String MESSAGE = "Не верное количество вопросов";
//    public TooLargeAmountQuestionException(String message) {
//         super(MESSAGE);
//    }
    public TooLargeAmountQuestionException() {
        super(MESSAGE);
    }

}
