package com.springjpa.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// bean should always be public
	// @Bean
	// public CommandLineRunner commandLineRunner(
	// 		AuthorRepository repository) {
	// 	return args -> {
	// 		var author = Author.builder()
	// 				.firstName("Iain")
	// 				.lastName("Mosima")
	// 				.age(34)
	// 				.email("iainmosima@gmail.com")
	// 				.build();
	// 		repository.save(author);

	// 	};
	// }

}
