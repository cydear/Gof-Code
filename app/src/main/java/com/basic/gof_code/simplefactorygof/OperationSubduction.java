package com.basic.gof_code.simplefactorygof;

/**
 * 减法
 */
public class OperationSubduction extends Operation {
    /**
     * 每一功能运算都要实现此方法完成自己的运算
     *
     * @param numberA
     * @param numberB
     * @return
     */
    @Override
    public int operateResult(int numberA, int numberB) {
        return numberA - numberB;
    }
}
