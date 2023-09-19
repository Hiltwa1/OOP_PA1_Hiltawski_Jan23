package service;

import model.Employee;
import model.enums.EventType;

import java.util.List;

public interface EventSimulation {
    void organiseEvent(EventType type, List<Employee> staff);
}
