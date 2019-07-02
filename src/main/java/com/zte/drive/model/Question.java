package com.zte.drive.model;

/**
 * Author:helloboy
 * Date:2019-07-01 14:04
 * Description:<描述>
 */
public class Question {

    private Integer questionId;
    private String questionContent;
    private Integer type;
    private String a_answer;
    private String b_answer;
    private String c_answer;
    private String d_answer;
    private String answer;
    private String analyse;
    private String picture;

    public Question() {
    }

    public Question(Integer questionId, String questionContent, Integer type, String a_answer, String b_answer, String c_answer, String d_answer, String answer, Comment comment, String analyse, String picture) {
        this.questionId = questionId;
        this.questionContent = questionContent;
        this.type = type;
        this.a_answer = a_answer;
        this.b_answer = b_answer;
        this.c_answer = c_answer;
        this.d_answer = d_answer;
        this.answer = answer;
        this.analyse = analyse;
        this.picture = picture;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getA_answer() {
        return a_answer;
    }

    public void setA_answer(String a_answer) {
        this.a_answer = a_answer;
    }

    public String getC_answer() {
        return c_answer;
    }

    public void setC_answer(String c_answer) {
        this.c_answer = c_answer;
    }

    public String getB_answer() {
        return b_answer;
    }

    public void setB_answer(String b_answer) {
        this.b_answer = b_answer;
    }

    public String getD_answer() {
        return d_answer;
    }

    public void setD_answer(String d_answer) {
        this.d_answer = d_answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }



    public String getAnalyse() {
        return analyse;
    }

    public void setAnalyse(String analyse) {
        this.analyse = analyse;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", questionContent='" + questionContent + '\'' +
                ", type=" + type +
                ", a_answer='" + a_answer + '\'' +
                ", b_answer='" + b_answer + '\'' +
                ", c_answer='" + c_answer + '\'' +
                ", d_answer='" + d_answer + '\'' +
                ", answer='" + answer + '\'' +
                ", analyse='" + analyse + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
