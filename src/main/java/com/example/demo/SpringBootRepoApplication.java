package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRepoApplication.class, args);
		System.out.println("SpringBootRepoApplication.main()");

		int a = 10, b = 20;
		int c = a + b;
		System.out.println("Ans is :" + c);

	}

}
