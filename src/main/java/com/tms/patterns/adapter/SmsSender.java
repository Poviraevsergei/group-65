package com.tms.patterns.adapter;

public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("logic for sms notification");
    }
}
