package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.TransitCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TransitConditionRepository extends JpaRepository<TransitCondition, Integer> {
    TransitCondition findByName(@Param("name") String name);
}
