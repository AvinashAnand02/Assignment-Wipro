package com.notification.notification_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.notification.notification_service.model.Notification;
import com.notification.notification_service.repository.NotificationRepository;

@Service
public class NotificationService {

    private final NotificationRepository repository;

    public NotificationService(NotificationRepository repository) {
        this.repository = repository;
    }

    public List<Notification> getAll() {
        return repository.findAll();
    }

    public Notification getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Notification create(Notification notification) {
        return repository.save(notification);
    }

    public Notification markAsRead(Long id) {
        return repository.findById(id).map(existing -> {
            existing.setReadStatus(true);
            return repository.save(existing);
        }).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
