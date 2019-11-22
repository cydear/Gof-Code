package com.basic.gof_code.proxygof.standard;

/**
 * 真实的实现类
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("我是真实的实现类");
    }
}
