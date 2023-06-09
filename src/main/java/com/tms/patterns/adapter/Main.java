package com.tms.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Sender sender = new TelegramAdapter();
        sender.send();
    }
}
