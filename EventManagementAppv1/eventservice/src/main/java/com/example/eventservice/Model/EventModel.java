package com.example.eventservice.Model;


import java.time.Instant;


public class EventModel {
    private Long id;
    private String name;
    private String description;
    private Instant startDateTime;
    private Instant endDateTime;
    private Long venueId;
    private Long organizerId;

    public EventModel() {
    }

    public EventModel(Long id, Long organizerId, Long venueId, Instant endDateTime, Instant startDateTime, String description, String name) {
        this.id = id;
        this.organizerId = organizerId;
        this.venueId = venueId;
        this.endDateTime = endDateTime;
        this.startDateTime = startDateTime;
        this.description = description;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Instant startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Instant getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Instant endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Long getVenueId() {
        return venueId;
    }

    public void setVenueId(Long venueId) {
        this.venueId = venueId;
    }

    public Long getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(Long organizerId) {
        this.organizerId = organizerId;
    }
}