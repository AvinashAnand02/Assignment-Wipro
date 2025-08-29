package com.classroom.classroom_service.service;

import com.classroom.classroom_service.model.Classroom;
import com.classroom.classroom_service.repository.ClassroomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {

    private final ClassroomRepository repository;

    public ClassroomService(ClassroomRepository repository) {
        this.repository = repository;
    }

    public Classroom saveClassroom(Classroom classroom) {
        return repository.save(classroom);
    }

    public List<Classroom> getAllClassrooms() {
        return repository.findAll();
    }

    public Classroom getClassroomById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteClassroom(Long id) {
        repository.deleteById(id);
    }
}