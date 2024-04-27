package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Event {
    @Id
    Integer id;
    String eventName;
    String eventDescription;
    String eventDate;
    int eventCapacity;
    int registeredAttendees;
    public Event()
    {
        
    }
    public Event(Integer id, String eventName, String eventDescription, String eventDate, int eventCapacity, int registeredAttendees) {
        this.id = id;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
        this.eventCapacity = eventCapacity;
        this.registeredAttendees = registeredAttendees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getEventCapacity() {
        return eventCapacity;
    }

    public void setEventCapacity(int eventCapacity) {
        this.eventCapacity = eventCapacity;
    }

    public int getRegisteredAttendees() {
        return registeredAttendees;
    }

    public void setRegisteredAttendees(int registeredAttendees) {
        this.registeredAttendees = registeredAttendees;
    }
}
