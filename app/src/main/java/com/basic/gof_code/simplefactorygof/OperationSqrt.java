package com.basic.gof_code.simplefactorygof;

/**
 * 平方根
 */
public class OperationSqrt extends Operation {
    /**
     * 每一功能运算都要实现此方法完成自己的运算
     *
     * @return
     */
    @Override
    public double operateResult(double number) {
        return Math.sqrt(number);
    }
}
