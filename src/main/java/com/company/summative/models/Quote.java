package com.company.summative.models;

public class Quote {
    private String Author;
    private int id;
    private String quote;

    public Quote(){

    }

    public Quote(String quote, String Author, int id){
        this.Author=Author;
        this.quote=quote;
        this.id=id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
