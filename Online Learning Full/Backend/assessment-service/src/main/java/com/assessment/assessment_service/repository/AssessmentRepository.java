package com.assessment.assessment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.assessment_service.model.Assessment;

public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
}