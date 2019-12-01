package com.basic.gof_code.facadegof;

public class Facade {
    private SubSystemOne subOne;
    private SubSystemTwo subTwo;
    private SubSystemThree subThree;

    public Facade() {
        subOne = new SubSystemOne();
        subTwo = new SubSystemTwo();
        subThree = new SubSystemThree();
    }

    public void methodA() {
        System.out.println("方法组A()-------");
        subOne.methodOne();
        subTwo.methodTwo();
        subThree.methodThree();
    }

    public void methodB() {
        System.out.println("方法组B()------");
        subTwo.methodTwo();
        subThree.methodThree();
    }
}
