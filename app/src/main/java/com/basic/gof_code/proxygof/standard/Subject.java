package com.basic.gof_code.proxygof.standard;

/**
 * 定义RealSubject和Proxy的功用接口，这样在任何地方使用RealSubject的地方都可以使用Proxy
 */
public interface Subject {
    public void request();
}
