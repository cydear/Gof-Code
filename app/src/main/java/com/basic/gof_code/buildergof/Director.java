package com.basic.gof_code.buildergof;

public class Director {
    public void consttruct(IBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
