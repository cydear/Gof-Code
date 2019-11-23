package com.basic.gof_code.templategof.standard;

public class TeamplateMain {
    public static void main(String[] args) {
        AbstractClass concreteA = new ConcreteClassA();
        AbstractClass concreteB = new ConcreteClassB();

        concreteA.primitiveOperationA();
        concreteA.primitiveOperationB();

        concreteB.primitiveOperationA();
        concreteB.primitiveOperationB();
    }
}
