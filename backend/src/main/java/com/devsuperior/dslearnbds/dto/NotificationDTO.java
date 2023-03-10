package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.model.Notification;

import java.time.Instant;

public class NotificationDTO {

    private Long id;
    private Long userId;
    private String text;
    private Instant moment;
    private boolean read;
    private String route;

    public NotificationDTO() {
    }

    public NotificationDTO(Long id, Long userId, String text, Instant moment, boolean read, String route) {
        this.id = id;
        this.userId = userId;
        this.text = text;
        this.moment = moment;
        this.read = read;
        this.route = route;
    }

    public NotificationDTO(Notification entity) {
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
