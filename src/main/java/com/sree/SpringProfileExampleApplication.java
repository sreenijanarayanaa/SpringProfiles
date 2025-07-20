package com.sree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringProfileExampleApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileExampleApplication.class, args);
		
		System.out.println("Hello from main method!!!");
		
	}

}
