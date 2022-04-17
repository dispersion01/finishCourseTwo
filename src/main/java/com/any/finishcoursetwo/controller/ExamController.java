package com.any.finishcoursetwo.controller;

import com.any.finishcoursetwo.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.any.finishcoursetwo.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping ("get")
    public Collection<Question> getQuestion(@RequestParam int amount ) {

        return examinerService.getQuestions(amount);
    }
}
