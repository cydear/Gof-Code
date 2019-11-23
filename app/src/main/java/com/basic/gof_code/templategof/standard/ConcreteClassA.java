package com.basic.gof_code.templategof.standard;

public class ConcreteClassA extends AbstractClass {
    /**
     * 抽象行为 供子类实现
     */
    @Override
    public void primitiveOperationA() {
        System.out.println("具体A类实现的A方法");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("具体A类实现的B方法");
    }
}
