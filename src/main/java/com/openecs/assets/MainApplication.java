package com.openecs.assets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
@EnableSwagger2
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {		
		return args -> {};	
	}		

}
