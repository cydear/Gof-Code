package com.basic.gof_code.buildergof;

public abstract class IBuilder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public abstract Product getResult();
}
