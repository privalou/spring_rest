package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.TransitCondition;
import com.pupiq.restfordiploma.repository.TransitConditionRepository;
import com.pupiq.restfordiploma.service.TransitConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransitConditionServiceImpl implements TransitConditionService {

    @Autowired
    TransitConditionRepository repository;

    @Override
    public List<TransitCondition> addTransitConditions(List<TransitCondition> transitConditions) {
        return repository.saveAll(transitConditions);
    }
}
