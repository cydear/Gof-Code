package com.basic.gof_code.decoratorgof;

/**
 * 定义一个具体的对象，也是被装饰的对象
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("我是具体实现的核心方法");
    }
}
