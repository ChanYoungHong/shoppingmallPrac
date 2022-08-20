package com.spharosacademy.jpa.project.spharosmvcandjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpharosmvcandjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpharosmvcandjpaApplication.class, args);
	}

}
