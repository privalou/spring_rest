package com.pupiq.restfordiploma.service.impl;

import com.pupiq.restfordiploma.model.UserRole;
import com.pupiq.restfordiploma.repository.UserRoleRepository;
import com.pupiq.restfordiploma.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleRepository repository;

    @Override
    public UserRole addUserRole(UserRole userRole) {
        return repository.saveAndFlush(userRole);
    }

    @Override
    public List<UserRole> addUserRoles(List<UserRole> userRoles) {
        return repository.saveAll(userRoles);
    }

    @Override
    public UserRole getUserRole(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<UserRole> getRoles() {
        return repository.findAll();
    }
}
