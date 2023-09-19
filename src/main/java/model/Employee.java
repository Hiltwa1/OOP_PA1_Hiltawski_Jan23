package model;

import model.enums.Role;

public class Employee {
    private String name;
    private Role role;
    private int OrgHistory;

    public Employee(String name, Role role, int OrgHistory) {
        this.name = name;
        this.role = role;
        this.OrgHistory = OrgHistory;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public int getOrgHistory() {
        return OrgHistory;
    }
}
