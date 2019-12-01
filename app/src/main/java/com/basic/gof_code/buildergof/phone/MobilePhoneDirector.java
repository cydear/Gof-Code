package com.basic.gof_code.buildergof.phone;

public class MobilePhoneDirector {
    public MobilePhone createMobilePhone(IBuilderPhone builderPhone) {
        builderPhone.buildBattery();
        builderPhone.builderScreen();
        builderPhone.buildMicroPhone();
        builderPhone.buildPhoneBody();
        builderPhone.buildPhoneReceiver();
        return builderPhone.build();
    }
}
