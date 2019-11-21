package com.basic.gof_code.stratregygof;

public class CashReturn implements CashSuper {
    private double totalMoney = 0L;
    private double subductionMoney = 0L;

    public CashReturn(double tMoney, double sMoney) {
        this.totalMoney = sMoney;
        this.subductionMoney = sMoney;
    }

    @Override
    public double getResult(double money) {
        double result = money;
        if (money > totalMoney) {
            if (subductionMoney >= money) {
                result = 0L;
            } else {
                result = money - subductionMoney;
            }
        }
        return result;
    }
}
