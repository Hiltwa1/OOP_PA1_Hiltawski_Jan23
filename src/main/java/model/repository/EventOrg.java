package model.repository;

import model.Employee;
import model.enums.Role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface EventOrg {

    List<Employee> staff = new ArrayList<>(
            Arrays.asList(
                    new Employee("A", Role.HELPER, 0),
                    new Employee("B", Role.HELPER, 0),
                    new Employee("C", Role.HELPER, 0),
                    new Employee("D", Role.HELPER, 0),
                    new Employee("E", Role.HELPER, 0),
                    new Employee("F", Role.HELPER, 0),
                    new Employee("G", Role.HELPER, 0),
                    new Employee("H", Role.HELPER, 0),
                    new Employee("I", Role.HELPER, 0),
                    new Employee("J", Role.HELPER, 0),
                    new Employee("K", Role.ORGANISER, 0),
                    new Employee("L", Role.ORGANISER, 0),
                    new Employee("N", Role.ORGANISER, 0)
            )
    );
}
