package com.basic.gof_code.simplefactorygof;

public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSubduction();
                break;
            case "sqrt":
                operation = new OperationSqrt();
                break;
        }
        return operation;
    }
}
