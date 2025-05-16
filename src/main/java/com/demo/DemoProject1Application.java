package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoProject1Application.class, args);
		System.out.print("Welcome to Spring Initializr");
	}

}
