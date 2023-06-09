package com.tms.patterns.adapter;

public class SmsSender extends Sender {
    @Override
    void send() {
        System.out.println("logic for sms notification");
    }
}
