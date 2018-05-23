package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PropertyTypeRepository extends JpaRepository<PropertyType, Integer> {
    PropertyType findByName(@Param("name") String name);
}
