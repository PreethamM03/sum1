package com.company.summative.models;

public class Answer {
    private String answer;
    private String question;
    private int id;

    public Answer(){

    }

    public Answer(String answer, String question, int id) {
        this.answer = answer;
        this.question = question;
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
