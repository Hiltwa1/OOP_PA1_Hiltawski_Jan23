package model;

import java.util.List;

public class Event {
    private List<Employee> staff;
    private List<Guest> guests;

    public Event(List<Employee> staff) {
        this.staff = staff;
    }

    public List<Employee> getStaff() {
        return staff;
    }

}
