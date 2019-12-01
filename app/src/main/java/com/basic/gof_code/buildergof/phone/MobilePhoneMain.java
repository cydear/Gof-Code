package com.basic.gof_code.buildergof.phone;

public class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhoneDirector().createMobilePhone(new Iphone());
        System.out.println(mobilePhone.toString());
    }
}
