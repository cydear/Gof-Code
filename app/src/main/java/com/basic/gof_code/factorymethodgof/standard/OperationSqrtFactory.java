package com.basic.gof_code.factorymethodgof.standard;

public class OperationSqrtFactory implements IOperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationSqrt();
    }
}
