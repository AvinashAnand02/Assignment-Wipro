package com.classroom.classroom_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.classroom.classroom_service.model.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

}
