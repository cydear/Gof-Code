package com.basic.gof_code.buildergof.phone;

public class Iphone implements IBuilderPhone {
    private MobilePhone mobilePhone = new MobilePhone();

    @Override
    public void builderScreen() {
        mobilePhone.setScreen("OLED显示屏");
    }

    @Override
    public void buildBattery() {
        mobilePhone.setBattery("2700mAh电池");
    }

    @Override
    public void buildMicroPhone() {
        mobilePhone.setMicrophone("听筒");
    }

    @Override
    public void buildPhoneReceiver() {
        mobilePhone.setPhoneReceiver("话筒");
    }

    @Override
    public void buildPhoneBody() {
        mobilePhone.setPhoneBody("iphoneX机身");
    }

    @Override
    public MobilePhone build() {
        return mobilePhone;
    }
}
