package com.company.summative.controllers;

import com.company.summative.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private List<Quote> quoteList;

    private static int idCounter = 1;
    Random rand;

    public QuoteController(){
        quoteList = new ArrayList<>();
        rand = new Random();
        quoteList.add(new Quote("Just Do It", "Nike", idCounter++));
        quoteList.add(new Quote("To live is the rarest thing in the world. Most people exist, that is all.", "Oscar Wilde", idCounter++));
        quoteList.add(new Quote("That it will never come again is what makes life so sweet.", "Emily Dickinson", idCounter++));
        quoteList.add(new Quote("It is never too late to be what you might have been.", "George Eliot", idCounter++));
        quoteList.add(new Quote("To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.", "Ralph Waldo Emerson", idCounter++));
        quoteList.add(new Quote("Pain is inevitable. Suffering is optional.", "Haruki Murakami", idCounter++));
        quoteList.add(new Quote("All the world's a stage, and all the men and women merely players.", "William Shakespeare", idCounter++));
        quoteList.add(new Quote("Be kind, for everyone you meet is fighting a hard battle.", "Plato", idCounter++));
        quoteList.add(new Quote("Unable are the loved to die for love is immortality.", "Emily Dickinson", idCounter++));
        quoteList.add(new Quote("Let me live, love, and say it well in good sentences.", "Sylvia Plath", idCounter++));
    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {
        return quoteList.get(rand.nextInt(quoteList.size()));
    }
}
