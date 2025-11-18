package com.sbapp.learn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {
		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");

			List<String> beanNames = List.of(context.getBeanDefinitionNames());

			//String[] beanNamesary = context.getBeanDefinitionNames();

			//beanNames.stream().sorted().forEach(System.out::println);

		};
	}
}
