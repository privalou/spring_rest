package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(@Param("name") String name);
}
