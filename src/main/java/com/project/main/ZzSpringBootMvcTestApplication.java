package com.project.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.project.entity")
@EnableJpaRepositories("com.project.repo")
@ComponentScan({"com.project.service", "com.project.controller"})
public class ZzSpringBootMvcTestApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZzSpringBootMvcTestApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(ZzSpringBootMvcTestApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner demo(CustomerRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			repository.save(new Customer("Daniel", "Timofte"));
//			repository.save(new Customer("Nuri", "Asan"));
//			repository.save(new Customer("Muzaffer", "Badalıoglu"));
//			repository.save(new Customer("Serkan", "Aykut"));
//			repository.save(new Customer("Nuri", "Asan"));
//
//			// fetch all customers
//			for (Customer customer : repository.findAll()) {
//				
//			}
//			
//		};
//
//	}

	
}
