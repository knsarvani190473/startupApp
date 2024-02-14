package com.example.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StartupApplication {

	public static void main(String[] args) {

		SpringApplication.run(StartupApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext cxt) {
		return args -> {
			String beanNames[] = cxt.getBeanDefinitionNames();
			for (String bean1 : beanNames) {
				System.out.println(bean1);
			}
		};
	}
}

