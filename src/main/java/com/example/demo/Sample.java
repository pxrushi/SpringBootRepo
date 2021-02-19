package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Sample implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello is Command Line runner");
		System.out.println();
		System.out.println("Sample.run()");
		System.out.println("Sample.run()");
	}

}
