package model;

import model.enums.EventType;

import java.util.List;

public class Event {
    private List<Employee> staff;

    public Event(List<Employee> staff) {
        this.staff = staff;
    }

    public List<Employee> getStaff() {
        return staff;
    }

}
