package com.github.SecretLittleBoy.sms;

public class AliSmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }

    public String sendMMS(String message, String mediaUrl) {
        System.out.println("send message:" + message + ", mediaUrl:" + mediaUrl);
        return message;
    }
}