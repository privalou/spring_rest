package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.Road;
import com.pupiq.restfordiploma.repository.RoadRepository;
import com.pupiq.restfordiploma.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadServiceImpl implements RoadService {

    @Autowired
    RoadRepository roadRepository;

    @Override
    public Road addRoad(Road road) {
        return roadRepository.saveAndFlush(road);
    }

    @Override
    public List<Road> addRoads(List<Road> roads) {
        return roadRepository.saveAll(roads);
    }

    @Override
    public List<Road> getRoads() {
        return roadRepository.findAll();
    }

    @Override
    public Road getRoad(int id) {
        return roadRepository.getOne(id);
    }

    @Override
    public void deleteRoad(int id) {
        roadRepository.deleteById(id);
    }
}
