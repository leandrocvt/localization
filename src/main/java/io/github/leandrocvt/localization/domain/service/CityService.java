package io.github.leandrocvt.localization.domain.service;

import io.github.leandrocvt.localization.domain.entities.City;
import io.github.leandrocvt.localization.domain.repository.CityRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository repository){
        this.cityRepository = repository;
    }

    @Transactional
    public void saveCity(){
        var city = new City(1L, "São Paulo", 12396372L);
        cityRepository.save(city);
    }

    public void listCityByPopulation(){
        cityRepository.findByPopulationLessThanAndNameLike(500000L, "Fo%").forEach(System.out::println);
    }

    public void listCityByName(){
        Pageable pageable = PageRequest.of(1, 4);
        cityRepository.findByNameLike("%%%", pageable).forEach(System.out::println);
    }

    public void listByPopulation(){
        cityRepository.findByPopulation(800000L).forEach(System.out::println);
    }

    public void listCity(){
        cityRepository.findAll().forEach(System.out::println);
    }
}
