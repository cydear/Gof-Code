package com.basic.gof_code.proxygof.standard;

public class ProxyMain {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Proxy proxySubject = new Proxy(subject);
        proxySubject.request();
    }
}
