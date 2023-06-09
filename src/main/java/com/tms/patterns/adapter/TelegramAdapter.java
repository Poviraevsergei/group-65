package com.tms.patterns.adapter;

public class TelegramAdapter extends Sender {

    private final TelegramLogic telegramLogic = new TelegramLogic();

    @Override
    void send() {
        telegramLogic.sendMessageToTelegram();
    }
}
