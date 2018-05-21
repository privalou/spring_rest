package com.pupiq.restfordiploma.controller;

import com.pupiq.restfordiploma.exception.ResourceNotFoundException;
import com.pupiq.restfordiploma.model.UserRole;
import com.pupiq.restfordiploma.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
public class UserRoleController {

    @Autowired
    UserRoleRepository repository;

    @GetMapping("/roles")
    public Page<UserRole> getAllRoles(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @PostMapping("/roles")
    public UserRole createRole(@Valid @RequestBody UserRole userRole) {
        return repository.save(userRole);
    }

    @PutMapping("/roles/{roleId}")
    public UserRole updateRole(@PathVariable Integer roleId, @Valid @RequestBody UserRole userRoleRequest) {
        return repository.findById(roleId).map(userRole -> {
            userRole.setRoleName(userRoleRequest.getRoleName());
            return repository.save(userRole);
        }).orElseThrow(() -> new RuntimeException("UserId " + roleId + " not found"));
    }


    @DeleteMapping("/roles/{roleId}")
    public ResponseEntity<?> deletePost(@PathVariable Integer roleId) {
        return repository.findById(roleId).map(userRole -> {
            repository.delete(userRole);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("UserId " + roleId + " not found"));
    }

}
