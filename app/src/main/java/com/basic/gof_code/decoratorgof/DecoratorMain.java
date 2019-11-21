package com.basic.gof_code.decoratorgof;

public class DecoratorMain {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA();
        Decorator decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(concreteComponent);
        decoratorA.operation();

        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }
}
