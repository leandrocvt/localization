package io.github.leandrocvt.localization.domain.repository;

import io.github.leandrocvt.localization.domain.entities.City;
import io.github.leandrocvt.localization.domain.repository.projections.CityProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long>, JpaSpecificationExecutor<City> {
    @Query(nativeQuery = true, value = " select c.id_city as id, c.name from tb_city as c where c.name =:name")
    List<CityProjection> findByNameSqlNative(@Param("name") String name);
    List<City> findByName(String name);

    @Query(" select c from City c where lower(c.name) like lower(?1) ")
    List<City> findByNameLike(String name, Sort sort);
    @Query(" select c from City c where lower(c.name) like lower(?1) ")
    Page<City> findByNameLike(String name, Pageable pageable);
    List<City> findByNameStartingWith(String name);
    List<City> findByNameEndingWith(String name);
    List<City> findByNameContaining(String name);
    List<City> findByPopulation(Long population);
    List<City> findByPopulationLessThan(Long population);
    List<City> findByPopulationGreaterThan(Long population);
    List<City> findByPopulationLessThanEqual(Long population);
    List<City> findByPopulationLessThanAndNameLike(Long population, String name);

}
