package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.RoadClass;

import java.util.List;

public interface RoadClassService {
    List<RoadClass> addRoadClasses(List<RoadClass> roadClasses);

    List<RoadClass> getRoadClasses();

    RoadClass getRoadClass(int id);

    RoadClass getRoadClass(String name);
}
