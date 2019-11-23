package com.basic.gof_code.templategof;

public abstract class TestPaper {
    public void testQuestionA() {
        System.out.println("杨过得到，后来给了郭靖，炼成倚天剑，屠龙刀的玄铁可能是[ ] a. 球磨铁  b. 马口铁 c. 高速合金钢 d. 碳纤维");
        System.out.println("答案:" + answerA());
    }

    protected abstract String answerA();

    public void testQuestionB() {
        System.out.println("杨过，程英，陆无双铲除了情花，造成[ ] a. 使这种植物不再害人  b. 使一种珍稀物种灭绝  c. 破坏了那个生物圈的生态平衡  d. 造成该地沙漠化");
        System.out.println("答案:" + answerB());
    }

    protected abstract String answerB();
}
