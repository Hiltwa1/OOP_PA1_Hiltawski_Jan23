package service;

import model.Employee;
import model.Guest;
import model.enums.EventType;

import java.util.List;

public interface EventSimulation {
    void organiseEvent(EventType type, List<Employee> staff, List<Guest> guests);
    String mostTimesChief(List<Employee> staff);
}
