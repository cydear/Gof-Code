package com.basic.gof_code.factorymethodgof.standard;

public class OperationMain {
    public static void main(String[] args) {
        Operation addOp = new OperationAddFactory().createOperation();
        System.out.println("100+50=" + addOp.operationResult(100, 50));

        Operation subOp = new OperationSubFactory().createOperation();
        System.out.println("100-50=" + subOp.operationResult(100, 50));

        Operation sqrtOp = new OperationSqrtFactory().createOperation();
        System.out.println("100平方根=" + addOp.operationResult(100));
    }
}
