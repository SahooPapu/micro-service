package com.example.MSProj01EurekaServerForDiscoveryClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsProj01EurekaServerForDiscoveryClientApplication {

	public static void main(String[] args) {
		System.out.println("Eureka server main() method ");
		SpringApplication.run(MsProj01EurekaServerForDiscoveryClientApplication.class, args);
	}

}
