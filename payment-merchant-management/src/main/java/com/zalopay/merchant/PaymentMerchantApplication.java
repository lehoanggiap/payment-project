package com.zalopay.merchant;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class PaymentMerchantApplication {

    public static void main(String[] args) {
        SpringApplication springBootApplication = new SpringApplication(PaymentMerchantApplication.class);
        springBootApplication.run(args);
    }

}
