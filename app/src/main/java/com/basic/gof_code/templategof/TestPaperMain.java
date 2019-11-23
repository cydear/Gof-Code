package com.basic.gof_code.templategof;

public class TestPaperMain {
    public static void main(String[] args) {
        TestPaper studentA = new StudentAPaper();
        studentA.testQuestionA();
        studentA.testQuestionB();

        TestPaper studentB = new StudentBPaper();
        studentB.testQuestionA();
        studentB.testQuestionB();
    }
}
