package com.bip.MSProj03EurekaServerforFeignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsProj03EurekaServerForFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj03EurekaServerForFeignClientApplication.class, args);
	}

}
