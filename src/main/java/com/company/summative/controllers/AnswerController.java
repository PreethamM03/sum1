package com.company.summative.controllers;

import com.company.summative.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {
    private List<Answer> answerList;
    private List<String> answers;

    private static int idCounter = 1;
    Random rand;

    public AnswerController(){
        answerList=new ArrayList<>();
        rand = new Random();
        answers = new ArrayList<>();
        answers.add("Yes");
        answers.add("No");
        answers.add("Maybe");
        answers.add("It is a possibility");
        answers.add("Probably not");
        answers.add("I don't know");
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer magic(@RequestParam(required = false) String question) {
        Answer answer = new Answer(answers.get(rand.nextInt(answers.size())), question, idCounter++);
        return answer;
    }

}
