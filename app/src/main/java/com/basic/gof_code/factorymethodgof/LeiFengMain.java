package com.basic.gof_code.factorymethodgof;

public class LeiFengMain {
    public static void main(String[] args) {
        LeiFeng undergraduate = new UndergraduateFactory().createLeiFeng();
        undergraduate.sweep();
        undergraduate.wash();
        undergraduate.buyRice();

        LeiFeng volunteer = new VolunteerFactory().createLeiFeng();
        volunteer.sweep();
        volunteer.wash();
        volunteer.buyRice();
    }
}
