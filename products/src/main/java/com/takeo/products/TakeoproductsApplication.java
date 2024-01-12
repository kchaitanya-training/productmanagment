package com.takeo.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.takeo")
public class TakeoproductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TakeoproductsApplication.class, args);
	}

}
