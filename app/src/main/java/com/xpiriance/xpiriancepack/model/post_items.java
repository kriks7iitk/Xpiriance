package com.xpiriance.xpiriancepack.model;

public class post_items {

    private String PAname , PAdesignation  ;
    private String APname , APdesignation   ;
    private String QuestionAsked , AnswerGiven;



    public post_items(String PAname, String PAdesignation, String APname,
                      String APdesignation, String questionAsked, String answerGiven ){
        this.PAname = PAname;
        this.PAdesignation = PAdesignation;
        this.APname = APname;
        this.APdesignation = APdesignation;
        this.QuestionAsked = questionAsked;
        this.AnswerGiven = answerGiven;
    }


    public String getPAname() {
        return PAname;
    }

    public String getPAdesignation() {
        return PAdesignation;
    }

    public String getAPname() {
        return APname;
    }

    public String getAPdesignation() {
        return APdesignation;
    }

    public String getQuestionAsked() {
        return QuestionAsked;
    }

    public String getAnswerGiven() {
        return AnswerGiven;
    }


}
