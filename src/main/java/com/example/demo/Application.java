package com.example.demo;

import com.example.demo.product.Product;
import com.example.demo.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Autowired
    ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner myRunMethod() {
        return (args) -> {
            System.out.println("***Generating sample data***");
            productService.save(new Product(1L, "Test 1", "Test", 0d));
            productService.save(new Product(2L, "Test 2", "Test", 0d));
            productService.save(new Product(3L, "Test 3", "Test", 0d));
            System.out.println("***Done***");
        };
    }
}
