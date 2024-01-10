package com.bip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MsProj01ShoppingServiceConsumerApplication {

    public static void main(String[] args) {
        System.out.println("Service shopping serivice main() method");
        SpringApplication.run(MsProj01ShoppingServiceConsumerApplication.class, args);
    }

}
