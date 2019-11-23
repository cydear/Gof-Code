package com.basic.gof_code.templategof;

public class StudentAPaper extends TestPaper {
    @Override
    protected String answerA() {
        return "A";
    }

    @Override
    protected String answerB() {
        return "B";
    }
}
