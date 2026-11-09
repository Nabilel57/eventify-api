package com.eventify.service;


import com.eventify.dto.EventResponse;
import com.eventify.entity.Event;
import com.eventify.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;
    public List<EventResponse> getallEvents() {
        return eventRepository.findAll().stream().map(this::toResponse).toList();
    }
    public EventResponse toResponse(Event event){
        return new EventResponse(
                event.getId(),
                event.getName(),
                event.getDescription(),
                event.getVenue(),
                event.getEventDate(),
                event.getTotalSeats(),
                event.getAvailableSeats()
        );
    }

    public @Nullable List<EventResponse> getAllEvents() {
        return eventRepository.findAll().stream().map(this::toResponse).toList();
    }
}
