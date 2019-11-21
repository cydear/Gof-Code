package com.basic.gof_code.stratregygof;

public class StrategyMain {
    public static void main(String[] args) {
        CashContext cashContext = new CashContext("0.8");
        System.out.println("打8折:" + cashContext.getResult(500));

        CashContext cashContext1 = new CashContext("300 subduction 50");
        System.out.println("满300减50:" + cashContext1.getResult(600));

        CashContext cashContext2 = new CashContext("normal");
        System.out.println("正常价:" + cashContext2.getResult(1000));
    }
}
