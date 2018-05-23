package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserRoleService {
    UserRole addUserRole(UserRole userRole);

    List<UserRole> addUserRoles(List<UserRole> userRoles);

    UserRole getUserRole(int id);

    Optional<UserRole> getOptionalUserRole(int id);

    List<UserRole> getRoles();

    Page<UserRole> getRoles(Pageable pageable);

    void deleteRole(int id);
}
