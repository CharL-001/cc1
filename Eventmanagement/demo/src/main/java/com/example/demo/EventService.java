package com.example.demo;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event createEvent(@NonNull Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(@NonNull Integer id) {
        return eventRepository.findById(id).orElse(null);
    }

    public boolean updateEvent(int id, Event event) {
        if (getEventById(id) == null) {
            return false;
        }
        try {
            eventRepository.save(event);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean deleteEvent(int id) {
        if (getEventById(id) == null) {
            return false;
        }
        eventRepository.deleteById(id);
        return true;
    }
}
