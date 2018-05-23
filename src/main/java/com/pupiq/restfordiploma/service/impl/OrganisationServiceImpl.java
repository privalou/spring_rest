package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.Organisation;
import com.pupiq.restfordiploma.repository.OrganisationRepository;
import com.pupiq.restfordiploma.service.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisationServiceImpl implements OrganisationService {

    @Autowired
    OrganisationRepository repository;

    @Override
    public Organisation addOrganisation(Organisation organisation) {
        return repository.saveAndFlush(organisation);
    }

    @Override
    public List<Organisation> addOrganisations(List<Organisation> organisations) {
        return repository.saveAll(organisations);
    }

    @Override
    public List<Organisation> getOrganisations() {
        return repository.findAll();
    }

    @Override
    public Organisation getOrganisation(int id) {
        return repository.getOne(id);
    }

    @Override
    public Organisation getOrganisation(String name) {
        return repository.findByName(name);
    }
}
