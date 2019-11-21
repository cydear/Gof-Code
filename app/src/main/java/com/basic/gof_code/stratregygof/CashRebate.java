package com.basic.gof_code.stratregygof;

public class CashRebate implements CashSuper {
    private double rebait = 1L;

    public CashRebate(double rebate) {
        this.rebait = rebate;
    }

    @Override
    public double getResult(double money) {
        return money * rebait;
    }
}
