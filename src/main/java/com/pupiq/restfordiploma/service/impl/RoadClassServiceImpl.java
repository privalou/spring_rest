package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.RoadClass;
import com.pupiq.restfordiploma.repository.RoadClassRepository;
import com.pupiq.restfordiploma.service.RoadClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoadClassServiceImpl implements RoadClassService {

    @Autowired
    private RoadClassRepository repository;

    @Override
    public List<RoadClass> addRoadClasses(List<RoadClass> roadClasses) {
        return repository.saveAll(roadClasses);
    }

    @Override
    public List<RoadClass> getRoadClasses() {
        return repository.findAll();
    }

    @Override
    public RoadClass getRoadClass(int id) {
        return repository.getOne(id);
    }

    @Override
    public RoadClass getRoadClass(String name) {
        return repository.findByName(name);
    }
}
