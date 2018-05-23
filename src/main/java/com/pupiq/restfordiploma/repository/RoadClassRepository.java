package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.RoadClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface RoadClassRepository extends JpaRepository<RoadClass, Integer> {
    RoadClass findByName(@Param("name") String name);
}
