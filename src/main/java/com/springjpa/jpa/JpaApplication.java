package com.springjpa.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.jpa.models.Video;
import com.springjpa.jpa.repositories.AuthorRepository;
import com.springjpa.jpa.repositories.VideoRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// bean should always be public
	// @Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository
			) {
		return args -> {
			// var author = Author.builder()
			// 		.firstName("Iain")
			// 		.lastName("Mosima")
			// 		.age(22)
			// 		.email("iainmosima@gmail.com")
			// 		.build();
			// repository.save(author);
			var video = Video.builder()
						.name("abc")
						.length(5)
						.build();
			videoRepository.save(video);

		};
	}

}
