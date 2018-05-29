package com.pupiq.restfordiploma.controller;

import com.pupiq.restfordiploma.model.Violation;
import com.pupiq.restfordiploma.service.ViolationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ViolationController {
    @Resource
    ViolationService service;

    @GetMapping("/violations")
    public List<Violation> getAllRoles() {
        //TODO: finish get and post methods for violations and also time to finish road owners
        return service.getViolations();
    }
}
