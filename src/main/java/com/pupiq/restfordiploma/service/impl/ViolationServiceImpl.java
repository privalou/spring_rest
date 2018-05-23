package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.Violation;
import com.pupiq.restfordiploma.repository.ViolationRepository;
import com.pupiq.restfordiploma.service.ViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViolationServiceImpl implements ViolationService {
    @Autowired
    ViolationRepository repository;

    @Override
    public Violation addViolation(Violation violation) {
        return repository.save(violation);
    }

    @Override
    public List<Violation> addViolations(List<Violation> violations) {
        return repository.saveAll(violations);
    }

    @Override
    public Violation getViolation(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<Violation> getViolations() {
        return repository.findAll();
    }

    @Override
    public Page<Violation> getViolations(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
