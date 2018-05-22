package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.TransitCondition;

import java.util.List;

public interface TransitConditionService {
    List<TransitCondition> addTransitConditions(List<TransitCondition> transitConditions);
    List<TransitCondition> getTransitCondition();
}
