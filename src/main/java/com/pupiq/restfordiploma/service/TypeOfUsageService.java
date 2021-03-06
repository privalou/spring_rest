package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.TypeOfUsage;

import java.util.List;

public interface TypeOfUsageService {
    List<TypeOfUsage> addTypeOfUsages(List<TypeOfUsage> typeOfUsages);

    List<TypeOfUsage> getTypeOfUsages();

    TypeOfUsage getTypeOfUsage(int id);

    TypeOfUsage getTypeOfUsage(String name);
}
