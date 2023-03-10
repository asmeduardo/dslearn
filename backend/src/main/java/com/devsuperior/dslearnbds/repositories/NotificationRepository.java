package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.model.Notification;
import com.devsuperior.dslearnbds.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    Page<Notification> findByUser(User user, Pageable pageable);
}
