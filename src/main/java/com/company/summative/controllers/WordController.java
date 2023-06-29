package com.company.summative.controllers;

import com.company.summative.models.Quote;
import com.company.summative.models.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    private List<Word> wordList;

    private static int idCounter = 1;
    Random rand;

    public WordController(){
        wordList = new ArrayList<>();
        rand = new Random();

        wordList.add(new Word("Sassy", "distinctively smart and stylish", idCounter++));
        wordList.add(new Word("Effuse", "to pour forth.", idCounter++));
        wordList.add(new Word("Rend", "to split or tear apart or in pieces by violence.", idCounter++));
        wordList.add(new Word("Phonic", "pertaining to the nature of sound.", idCounter++));
        wordList.add(new Word("Virtu", "rare, curious, or aesthetic quality.", idCounter++));
        wordList.add(new Word("Misty", "filled or abounding with fog or mist.", idCounter++));
        wordList.add(new Word("Chasm", "a yawning hollow, as in the Earth’s surface.", idCounter++));
        wordList.add(new Word("Fervor", "ardor or intensity of feeling.", idCounter++));
        wordList.add(new Word("Lingo", "language.", idCounter++));
        wordList.add(new Word("Hustle", "to move with haste and promptness.", idCounter++));
    }
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Word getWord() {
        return wordList.get(rand.nextInt(wordList.size()));
    }
}
