package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.TypeOfUsage;
import com.pupiq.restfordiploma.repository.TypeOfUsageRepository;
import com.pupiq.restfordiploma.service.TypeOfUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfUsageServiceImpl implements TypeOfUsageService {

    @Autowired
    TypeOfUsageRepository repository;

    @Override
    public List<TypeOfUsage> addTypeOfUsages(List<TypeOfUsage> typeOfUsages) {
        return repository.saveAll(typeOfUsages);
    }

    @Override
    public List<TypeOfUsage> getTypeOfUsages() {
        return repository.findAll();
    }

    @Override
    public TypeOfUsage getTypeOfUsage(int id) {
        return repository.getOne(id);
    }

    @Override
    public TypeOfUsage getTypeOfUsage(String name) {
        return repository.findByName(name);
    }
}
