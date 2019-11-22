package com.basic.gof_code.factorymethodgof.standard;

public class OperationSqrt extends Operation {
    @Override
    public double operationResult(double number) {
        return Math.sqrt(number);
    }
}
