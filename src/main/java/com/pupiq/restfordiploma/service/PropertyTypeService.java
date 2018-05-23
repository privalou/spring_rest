package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.PropertyType;

import java.util.List;

public interface PropertyTypeService {
    PropertyType addPropertyType(PropertyType propertyType);

    List<PropertyType> addPropertyTypes(List<PropertyType> propertyTypes);

    PropertyType getPropertyType(int id);

    PropertyType getPropertyType(String name);

    List<PropertyType> getPropertyTypes();
}
