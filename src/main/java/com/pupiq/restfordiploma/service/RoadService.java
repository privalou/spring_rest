package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.Road;

import java.util.List;

public interface RoadService {
    Road addRoad(Road road);

    List<Road> addRoads(List<Road> roads);

    List<Road> getRoads();

    Road getRoad(int id);

    void deleteRoad(int id);
}
