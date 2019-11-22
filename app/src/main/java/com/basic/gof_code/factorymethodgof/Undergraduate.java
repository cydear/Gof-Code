package com.basic.gof_code.factorymethodgof;

public class Undergraduate extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("普通人 扫地");
    }

    @Override
    public void wash() {
        System.out.println("普通人 洗衣服");
    }

    @Override
    public void buyRice() {
        System.out.println("普通人 买米");
    }
}
