package com.mundackal.EcommService;

import com.mundackal.EcommService.repository.InitializingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommServiceApplication implements CommandLineRunner {


	InitializingService initializingService;

	public EcommServiceApplication(InitializingService initializingService) {
		this.initializingService = initializingService;
	}

	public static void main(String[] args) {
		SpringApplication.run(EcommServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		initializingService.initialise();
	}
}

