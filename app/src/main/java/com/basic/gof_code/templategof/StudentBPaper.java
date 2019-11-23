package com.basic.gof_code.templategof;

public class StudentBPaper extends TestPaper {
    @Override
    protected String answerA() {
        return "A";
    }

    @Override
    protected String answerB() {
        return "D";
    }
}
