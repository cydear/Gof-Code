package com.basic.gof_code.buildergof;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();

        ConcreteBuilderA builderA = new ConcreteBuilderA();
        director.consttruct(builderA);
        builderA.getResult().show();

        ConcreteBuilderB builderB = new ConcreteBuilderB();
        director.consttruct(builderB);
        builderB.getResult().show();
    }
}
