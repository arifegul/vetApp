package com.vet.app.config;

import java.util.List;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.vet.app.model.hayvan;
import com.vet.app.repository.hayvanRepository;
import com.vet.app.repository.hayvanSahipRepository;
import com.vet.app.repository.loginRepository;

@Configuration
public class hayvanConfig {

	@Bean
	CommandLineRunner commandLineRunner(hayvanRepository repository, hayvanSahipRepository hRepository, loginRepository lRepository) {
		
		return args -> {
			hayvan vetra = new hayvan(
					1L,
					"Arife Gül",
					"Kopek",
					"Sibirya kurdu",
					"Vetra",
					5,
					"Kulagının biri yok"
					);
			hayvan lilya = new hayvan(
					2L,
					"Beyza",
					"Kopek",
					"Pomeranian",
					"Lilya",
					2,
					"Bacagının biri kısa"
					);
			
			repository.saveAll(
					List.of(vetra,lilya)
			);
		
		
	};
	
	}
}
	

