package com.basic.gof_code.stratregygof;

/**
 * 策略模式 + 简单工厂
 */
public class CashContext {
    private CashSuper cs;

    public CashContext(String activeType) {
        switch (activeType) {
            case "normal":
                this.cs = new CashNormal();
                break;
            case "300 subduction 50":
                this.cs = new CashReturn(300, 50);
                break;
            case "0.8":
                this.cs = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double money) {
        return this.cs.getResult(money);
    }
}
