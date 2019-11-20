package com.basic.gof_code.simplefactorygof;

public class OperateMain {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        System.out.println("100+28=" + operation.operateResult(100, 28));

        Operation operation1 = OperationFactory.createOperation("-");
        System.out.println("100-25=" + operation1.operateResult(100, 25));

        Operation operation2 = OperationFactory.createOperation("sqrt");
        System.out.println("sqrt 100=" + operation2.operateResult(100));
    }
}
