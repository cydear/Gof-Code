package com.basic.gof_code.simplefactorygof;

/**
 * 计算器操作类的顶层类
 */
public class Operation {
    private int operateA;
    private int operateB;

    public void setOperateA(int operateA) {
        this.operateA = operateA;
    }

    public void setOperateB(int operateB) {
        this.operateB = operateB;
    }

    /**
     * 每一功能运算都要实现此方法完成自己的运算
     *
     * @param numberA
     * @param numberB
     * @return
     */
    public int operateResult(int numberA, int numberB) {
        return 0;
    }

    public double operateResult(double number) {
        return 0;
    }
}
