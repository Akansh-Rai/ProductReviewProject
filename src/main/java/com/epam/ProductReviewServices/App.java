package com.epam.ProductReviewServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class App {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplet() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
