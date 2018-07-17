package com.solstice.week3challenge.week3challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

@SpringBootApplication
public class Week3ChallengeApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(Week3ChallengeApplication.class, args);
	}
}
