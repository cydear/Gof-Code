package com.basic.gof_code.templategof.standard;

/**
 * 固定算法的抽象模板
 */
public abstract class AbstractClass {

    /**
     * 抽象行为 供子类实现
     */
    public abstract void primitiveOperationA();

    public abstract void primitiveOperationB();

    /**
     * 模板方法，给出逻辑骨架，而逻辑的组成是一些相应的抽象操作，它们都推迟到子类实现
     */
    public void teamplateMethod() {
        primitiveOperationA();
        primitiveOperationB();
        System.out.println("success");
    }
}
