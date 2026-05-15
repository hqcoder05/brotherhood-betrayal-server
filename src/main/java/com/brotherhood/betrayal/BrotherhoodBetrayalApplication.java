package com.brotherhood.betrayal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brotherhood.betrayal.config.EnvConfig;

@SpringBootApplication
public class BrotherhoodBetrayalApplication {

	public static void main(String[] args) {
		new EnvConfig();
		SpringApplication.run(BrotherhoodBetrayalApplication.class, args);
	}

}
