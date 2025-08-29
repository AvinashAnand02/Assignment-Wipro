package com.assessment.assessment_service.controller;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.assessment_service.model.Assessment;
import com.assessment.assessment_service.service.AssessmentService;

@RestController
@RequestMapping("/api/assessments")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials="true")
public class AssessmentController {

    private final AssessmentService service;

    public AssessmentController(AssessmentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Assessment> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Assessment getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Assessment create(@RequestBody Assessment assessment) {
        return service.create(assessment);
    }

    @PutMapping("/{id}")
    public Assessment update(@PathVariable Long id, @RequestBody Assessment updated) {
        return service.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}