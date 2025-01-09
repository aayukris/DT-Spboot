package com.example.venueservice.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
public class VenueAvailabilityModel {
    private Long id;
    private Long venueId;
    private Instant startDateTime;
    private Instant endDateTime;

    public VenueAvailabilityModel() {
    }

    public VenueAvailabilityModel(Long id, Long venueId, Instant startDateTime, Instant endDateTime) {
        this.id = id;
        this.venueId = venueId;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Instant endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Instant getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Instant startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Long getVenueId() {
        return venueId;
    }

    public void setVenueId(Long venueId) {
        this.venueId = venueId;
    }
}