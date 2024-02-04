package com.zalopay.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentMerchantApplication {

    public static void main(String[] args) {
        SpringApplication springBootApplication = new SpringApplication(PaymentMerchantApplication.class);
        springBootApplication.run(args);
    }

}
