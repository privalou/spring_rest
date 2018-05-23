package com.pupiq.restfordiploma.controller;

import com.pupiq.restfordiploma.exception.ResourceNotFoundException;
import com.pupiq.restfordiploma.model.UserRole;
import com.pupiq.restfordiploma.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserRoleController {

    @Autowired
    UserRoleService service;

    @GetMapping("/roles")
    public List<UserRole> getAllRoles() {
        return service.getRoles();
    }

    @PostMapping("/roles")
    public UserRole createRole(@Valid @RequestBody UserRole userRole) {
        return service.addUserRole(userRole);
    }

    @PutMapping("/roles/{roleId}")
    public UserRole updateRole(@PathVariable Integer roleId, @Valid @RequestBody UserRole userRoleRequest) {
        return service.getOptionalUserRole(roleId).map(userRole -> {
            userRole.setRoleName(userRoleRequest.getRoleName());
            return service.addUserRole(userRole);
        }).orElseThrow(() -> new RuntimeException("UserId " + roleId + " not found"));
    }


    @DeleteMapping("/roles/{roleId}")
    public ResponseEntity<?> deletePost(@PathVariable Integer roleId) {
        return service.getOptionalUserRole(roleId).map(userRole -> {
            service.deleteRole(roleId);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("UserId " + roleId + " not found"));
    }

}
