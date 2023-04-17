package io.github.leandrocvt.localization.domain.repository.specs;

import io.github.leandrocvt.localization.domain.entities.City;
import org.springframework.data.jpa.domain.Specification;

public abstract class CitySpecs {

    public static Specification<City> propertyEqual(String prop, Object value){
        return (root, query, cb) -> cb.equal( root.get(prop), value );
    }

    public static Specification<City> idEqual(Long id){
        return (root, query, cb) -> cb.equal( root.get("id"), id );
    }

    public static Specification<City> nameEqual(String name){
        return (root, query, cb) -> cb.equal( root.get("name"), name );
    }

    public static Specification<City> populationGreaterThan(Long value){
        return (root, query, cb) -> cb.greaterThan( root.get("population"), value );
    }

    public static Specification<City> populationBetween(Long min, Long max){
        return (root, query, cb) -> cb.between( root.get("popularion"), min, max);
    }

    public static Specification<City> nameLike(String name){
        return (root, query, cb) -> cb.like( cb.upper(root.get("name")), "%" +  name + "%".toUpperCase() );
    }
}
