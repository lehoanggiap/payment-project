package com.zalopay.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PaymentServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication springBootApplication = new SpringApplication(PaymentServiceRegistryApplication.class);
        springBootApplication.run(args);
    }

}
