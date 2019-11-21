package com.basic.gof_code.decoratorgof;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        preValidate();
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("add behavior success");
    }

    private void preValidate() {
        System.out.println("预校验数据通过");
    }
}
