package com.basic.gof_code.decoratorgof;

/**
 * 装饰抽象类，继承至Component，从外类来扩展Component类的功能，单对于Component来说，是无需知道Decorator的存在
 */
public abstract class Decorator implements Component {
    //核心实现类
    protected Component component;

    public void setComponent(Component comp) {
        this.component = comp;
    }

    /**
     * 实际执行的是核心实现类的方法
     */
    @Override
    public void operation() {
        if (this.component != null) {
            this.component.operation();
        }
    }
}
