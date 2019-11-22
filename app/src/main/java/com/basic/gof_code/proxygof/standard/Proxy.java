package com.basic.gof_code.proxygof.standard;

/**
 * 代理类
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        if (this.subject != null) {
            subject.request();
        }
    }
}
