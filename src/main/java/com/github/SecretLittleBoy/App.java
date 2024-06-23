package com.github.SecretLittleBoy;

import com.github.SecretLittleBoy.sms.AliSmsService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
        aliSmsService.sendMMS("java", "http://www.baidu.com");
    }
}
