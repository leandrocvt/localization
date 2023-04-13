package io.github.leandrocvt.localization.domain.repository;

import io.github.leandrocvt.localization.domain.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
