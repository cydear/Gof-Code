package com.basic.gof_code.proxygof;

public class ProxyPursuitMain {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("Lily");

        ProxyPursuit proxy = new ProxyPursuit(schoolGirl);

        proxy.giveChocolate();
        proxy.giveFlowers();
        proxy.giveDolls();
    }
}
