package com.any.finishcoursetwo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionExistsException extends RuntimeException {
    private static final String MESSAGE = "Список вопросов пуст";

    public QuestionExistsException() {
        super(MESSAGE);
    }

    public QuestionExistsException(String message) {
        super(message);
    }


}
