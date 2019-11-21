package com.basic.gof_code.decoratorgof;

/**
 * 具体的装饰对象,用于装饰核心实现类
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
