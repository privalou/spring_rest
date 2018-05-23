package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.Organisation;

import java.util.List;

public interface OrganisationService {
    Organisation addOrganisation(Organisation organisation);
    List<Organisation> addOrganisations(List<Organisation> organisations);
    List<Organisation> getOrganisations();
    Organisation getOrganisation(int id);
    Organisation getOrganisation(String name);
}
