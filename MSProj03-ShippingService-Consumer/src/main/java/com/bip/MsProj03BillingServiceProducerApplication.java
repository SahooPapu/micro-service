package com.bip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsProj03BillingServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj03BillingServiceProducerApplication.class, args);
	}

}
