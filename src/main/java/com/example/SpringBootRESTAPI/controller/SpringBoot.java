package com.example.SpringBootRESTAPI.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

//@EnableJpaRepositories(basePackages = {"com.example.customermanagementservice.repository.CustomerRepository"})
public class SpringBoot implements CommandLineRunner{

    @Value("${server.port}")
    private int serverPort;

    public static final Logger logger = LoggerFactory.getLogger(SpringBoot.class);
    
    public static void main(String[] args) {

        SpringApplication.run(SpringBoot.class, args);
    }

    @Bean
    public void printServerPort() {
        System.out.println("Server running on port: " + serverPort);
    }

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("It's my Logger....");
	}
}
