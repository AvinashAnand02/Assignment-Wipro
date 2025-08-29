package com.notification.notification_service.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.notification.notification_service.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
}
