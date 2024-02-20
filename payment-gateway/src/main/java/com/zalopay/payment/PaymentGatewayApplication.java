package com.zalopay.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentGatewayApplication {

    public static void main(String[] args) {
        SpringApplication springBootApplication = new SpringApplication(PaymentGatewayApplication.class);
        springBootApplication.run(args);
    }

}
