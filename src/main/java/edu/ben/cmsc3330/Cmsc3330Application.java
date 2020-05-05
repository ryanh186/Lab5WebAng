package edu.ben.cmsc3330;

import edu.ben.cmsc3330.data.model.Destination;
import edu.ben.cmsc3330.data.repository.DestinationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Cmsc3330Application {


	public static void main(String[] args) {
		SpringApplication.run(Cmsc3330Application.class, args);
	}

	@Bean
	CommandLineRunner init(DestinationRepository destinationRepository) {
		return args -> {
			Destination destination = new Destination("O'bo", "Chicago", "IL");
			destinationRepository.save(destination);
			destinationRepository.findAll().forEach(System.out::println);
		};

	}

}
