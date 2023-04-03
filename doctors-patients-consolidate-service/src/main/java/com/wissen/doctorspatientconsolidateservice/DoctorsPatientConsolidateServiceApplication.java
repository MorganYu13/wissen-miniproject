package com.wissen.doctorspatientconsolidateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@EnableDiscoveryClient
public class DoctorsPatientConsolidateServiceApplication {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate(); 
	}

	public static void main(String[] args) {
		SpringApplication.run(DoctorsPatientConsolidateServiceApplication.class, args);
	}

}