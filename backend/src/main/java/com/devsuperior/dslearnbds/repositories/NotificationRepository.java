package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}