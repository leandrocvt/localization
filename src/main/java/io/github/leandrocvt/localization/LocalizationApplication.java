package io.github.leandrocvt.localization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalizationApplication.class, args);

		System.out.println("Project Created");
	}

}