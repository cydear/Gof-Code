package com.basic.gof_code.buildergof.phone;

public class MobilePhone {
    private String screen;
    private String battery;
    private String microphone;
    private String phoneReceiver;
    private String phoneBody;

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getMicrophone() {
        return microphone;
    }

    public void setMicrophone(String microphone) {
        this.microphone = microphone;
    }

    public String getPhoneReceiver() {
        return phoneReceiver;
    }

    public void setPhoneReceiver(String phoneReceiver) {
        this.phoneReceiver = phoneReceiver;
    }

    public String getPhoneBody() {
        return phoneBody;
    }

    public void setPhoneBody(String phoneBody) {
        this.phoneBody = phoneBody;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "screen='" + screen + '\'' +
                ", battery='" + battery + '\'' +
                ", microphone='" + microphone + '\'' +
                ", phoneReceiver='" + phoneReceiver + '\'' +
                ", phoneBody='" + phoneBody + '\'' +
                '}';
    }
}
