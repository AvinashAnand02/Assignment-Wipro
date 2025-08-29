package com.assessment.assessment_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.assessment_service.model.Assessment;
import com.assessment.assessment_service.repository.AssessmentRepository;

@Service
public class AssessmentService {

    private final AssessmentRepository repository;

    public AssessmentService(AssessmentRepository repository) {
        this.repository = repository;
    }

    public List<Assessment> getAll() {
        return repository.findAll();
    }

    public Assessment getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Assessment create(Assessment assessment) {
        return repository.save(assessment);
    }

    public Assessment update(Long id, Assessment updated) {
        return repository.findById(id).map(existing -> {
            existing.setTitle(updated.getTitle());
            existing.setType(updated.getType());
            existing.setDueDate(updated.getDueDate());
            existing.setPassingCriteria(updated.getPassingCriteria());
            return repository.save(existing);
        }).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}