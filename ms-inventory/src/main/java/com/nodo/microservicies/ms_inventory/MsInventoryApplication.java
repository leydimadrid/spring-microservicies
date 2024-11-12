package com.nodo.microservicies.ms_inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsInventoryApplication.class, args);
	}

}
