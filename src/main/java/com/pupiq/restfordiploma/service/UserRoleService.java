package com.pupiq.restfordiploma.service;

import com.pupiq.restfordiploma.model.UserRole;

import java.util.List;

public interface UserRoleService {
    UserRole addUserRole(UserRole userRole);
    List<UserRole> addUserRoles(List<UserRole> userRoles);
    UserRole getUserRole(int id);
    List<UserRole> getRoles();
}
