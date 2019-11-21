package com.basic.gof_code.stratregygof;

public class CashNormal implements CashSuper{
    @Override
    public double getResult(double money) {
        return money;
    }
}
