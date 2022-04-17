package com.any.finishcoursetwo.controller;

import com.any.finishcoursetwo.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.any.finishcoursetwo.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class JavaQuestionController {

    private final QuestionService questionService;

    public JavaQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question,
                                @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question,
                                   @RequestParam String answer) {
        return questionService.remove(question,answer);
    }

    @GetMapping("/getAll")
    public Collection<Question> getAllQuestion() {
        return questionService.getAll();
    }

/*    @GetMapping("/random")
    public Question randomQ() {
        return questionService.getRandomQuestion();
    }*/

}
