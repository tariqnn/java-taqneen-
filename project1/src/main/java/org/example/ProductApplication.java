package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Main application class for Spring Boot

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration.class})
public class ProductApplication {
    public static void main(String[] args) {
        // Run the Spring Boot application

        SpringApplication.run(ProductApplication.class, args);
    }
}
