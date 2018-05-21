package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.Violation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViolationRepository extends JpaRepository<Violation, Integer> {
}
