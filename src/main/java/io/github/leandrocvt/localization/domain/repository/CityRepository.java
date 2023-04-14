package io.github.leandrocvt.localization.domain.repository;

import io.github.leandrocvt.localization.domain.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findByName(String name);

    @Query(" select c from City c where lower(c.name) like lower(?1) ")
    List<City> findByNameLike(String name);
    List<City> findByNameStartingWith(String name);
    List<City> findByNameEndingWith(String name);
    List<City> findByNameContaining(String name);
    List<City> findByPopulation(Long population);
}
