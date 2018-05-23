package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.TypeOfUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TypeOfUsageRepository extends JpaRepository<TypeOfUsage, Integer> {
    TypeOfUsage findByName(@Param("name") String name);
}
