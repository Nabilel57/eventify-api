package com.eventify.dto;

import java.time.LocalDateTime;

public class EventResponse {

    private Long id;
    private String name;
    private String description;
    private String venue;
    private LocalDateTime eventDate;
    private Integer totalSeats;
    private Integer availableSeats;

    // Constructeur vide (obligatoire pour Jackson)
    public EventResponse() {
    }

    // Constructeur avec paramètres (utilisé par ton Mapper)
    public EventResponse(Long id, String name, String description, String venue, LocalDateTime eventDate, Integer totalSeats, Integer availableSeats) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.venue = venue;
        this.eventDate = eventDate;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

    // Getters (obligatoires pour que Jackson les lise)
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getVenue() { return venue; }
    public LocalDateTime getEventDate() { return eventDate; }
    public Integer getTotalSeats() { return totalSeats; }
    public Integer getAvailableSeats() { return availableSeats; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setVenue(String venue) { this.venue = venue; }
    public void setEventDate(LocalDateTime eventDate) { this.eventDate = eventDate; }
    public void setTotalSeats(Integer totalSeats) { this.totalSeats = totalSeats; }
    public void setAvailableSeats(Integer availableSeats) { this.availableSeats = availableSeats; }
}