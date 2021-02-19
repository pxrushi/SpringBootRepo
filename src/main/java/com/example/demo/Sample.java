package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Sample implements CommandLineRunner {
	
	private int sno;
	private String sname;
	private String sadd;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello is Command Line runner");
		System.out.println();
		System.out.println("Sample.run()");
		System.out.println("Sample.run()");
	}

	@Override
	public String toString() {
		return "Sample [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + "]";
	}
	
	

}
