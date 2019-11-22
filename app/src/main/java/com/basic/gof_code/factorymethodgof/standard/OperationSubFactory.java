package com.basic.gof_code.factorymethodgof.standard;

public class OperationSubFactory implements IOperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
