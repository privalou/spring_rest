package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.Violation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ViolationService {
    Violation addViolation(Violation violation);

    List<Violation> addViolations(List<Violation> violations);

    Violation getViolation(int id);

    List<Violation> getViolations();

    Page<Violation> getViolations(Pageable pageable);
}
