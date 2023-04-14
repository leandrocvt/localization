package io.github.leandrocvt.localization;

import io.github.leandrocvt.localization.domain.entities.City;
import io.github.leandrocvt.localization.domain.repository.CityRepository;
import io.github.leandrocvt.localization.domain.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LocalizationApplication implements CommandLineRunner {
	@Autowired
	private CityService cityService;

	@Override
	public void run(String... args) throws Exception {
		cityService.listCityByName();
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizationApplication.class, args);

	}

}
