package com.any.finishcoursetwo.controller;

import com.any.finishcoursetwo.model.Question;
import org.springframework.web.bind.annotation.*;
import com.any.finishcoursetwo.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getQuestion(@PathVariable int amount) {
        return examinerService.getQuestions(amount);
    }
}
