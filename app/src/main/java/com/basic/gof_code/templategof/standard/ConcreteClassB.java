package com.basic.gof_code.templategof.standard;

public class ConcreteClassB extends AbstractClass {
    /**
     * 抽象行为 供子类实现
     */
    @Override
    public void primitiveOperationA() {
        System.out.println("具体B类实现的A方法");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("具体B类实现的B方法");
    }
}
