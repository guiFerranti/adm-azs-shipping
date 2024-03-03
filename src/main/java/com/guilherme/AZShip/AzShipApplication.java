package com.guilherme.AZShip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AzShipApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzShipApplication.class, args);
	}

}
