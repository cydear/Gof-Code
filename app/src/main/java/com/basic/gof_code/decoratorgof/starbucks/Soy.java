package com.basic.gof_code.decoratorgof.starbucks;

/**
 * 豆浆 Soy 装饰构件
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage = null;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
