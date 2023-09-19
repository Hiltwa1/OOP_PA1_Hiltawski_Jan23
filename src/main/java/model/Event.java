package model;

import model.enums.EventType;

import java.util.List;

public class Event {
    private List<Employee> staff;
    private EventType type;

    public Event(List<Employee> staff, EventType type) {
        this.staff = staff;
        this.type = type;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public EventType getType() {
        return type;
    }
}
