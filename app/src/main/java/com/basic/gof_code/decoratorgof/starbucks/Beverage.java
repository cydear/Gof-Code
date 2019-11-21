package com.basic.gof_code.decoratorgof.starbucks;

/**
 * 饮料类 抽象构建
 */
public abstract class Beverage {
    protected String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
