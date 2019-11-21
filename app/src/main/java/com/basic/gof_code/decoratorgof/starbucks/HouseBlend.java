package com.basic.gof_code.decoratorgof.starbucks;

/**
 * 黑咖啡具体构件
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.80;
    }
}
