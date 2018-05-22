package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.PropertyType;
import com.pupiq.restfordiploma.repository.PropertyTypeRepository;
import com.pupiq.restfordiploma.service.PropertyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyTypeServiceImpl implements PropertyTypeService {

    @Autowired
    private PropertyTypeRepository repository;

    @Override
    public PropertyType addPropertyType(PropertyType propertyType) {
        return repository.save(propertyType);
    }

    @Override
    public List<PropertyType> addPropertyTypes(List<PropertyType> propertyTypes) {
        return repository.saveAll(propertyTypes);
    }

    @Override
    public PropertyType getPropertyType(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<PropertyType> getPropertyTypes() {
        return repository.findAll();
    }
}
