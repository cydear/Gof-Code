package com.basic.gof_code.buildergof.phone;

public interface IBuilderPhone {
    void builderScreen();

    void buildBattery();

    void buildMicroPhone();

    void buildPhoneReceiver();

    void buildPhoneBody();

    MobilePhone build();
}
