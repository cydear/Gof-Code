package com.basic.gof_code.decoratorgof.starbucks;

/**
 * 摩卡 具体装饰类
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage = null;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
