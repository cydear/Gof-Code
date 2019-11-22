package com.basic.gof_code.factorymethodgof.standard;

public class OperationAddFactory implements IOperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
