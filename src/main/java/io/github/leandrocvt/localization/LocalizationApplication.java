package io.github.leandrocvt.localization;

import io.github.leandrocvt.localization.domain.entities.City;
import io.github.leandrocvt.localization.domain.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LocalizationApplication implements CommandLineRunner {

	@Autowired
	private CityRepository cityRepository;

	@Override
	public void run(String... args) throws Exception {
		listCityByName();
	}

	void listCityByName(){
		cityRepository.findByName("Recife").forEach(System.out::println);
		cityRepository.findByNameLike("PORTO%").forEach(System.out::println);
	}

	void listByPopulation(){
		cityRepository.findByPopulation(800000L).forEach(System.out::println);
	}

	@Transactional
	void saveCity(){
		var city = new City(1L, "São Paulo", 12396372L);
		cityRepository.save(city);
	}

	void listCity(){
		cityRepository.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizationApplication.class, args);

	}

}
