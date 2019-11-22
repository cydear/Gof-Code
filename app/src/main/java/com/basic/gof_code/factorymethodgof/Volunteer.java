package com.basic.gof_code.factorymethodgof;

public class Volunteer extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("志愿者 扫地");
    }

    @Override
    public void wash() {
        System.out.println("志愿者 洗衣服");
    }

    @Override
    public void buyRice() {
        System.out.println("志愿者 买米");
    }
}
