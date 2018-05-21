package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepository extends JpaRepository<Organisation, Integer> {
}
