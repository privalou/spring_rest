package com.pupiq.restfordiploma.repository;

import com.pupiq.restfordiploma.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface OrganisationRepository extends JpaRepository<Organisation, Integer> {
    Organisation findByName(@Param("name") String name);
}
