package com.zalopay.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentEngineApplication {

    public static void main(String[] args) {
        SpringApplication springBootApplication = new SpringApplication(PaymentEngineApplication.class);
        springBootApplication.run(args);
    }

}
