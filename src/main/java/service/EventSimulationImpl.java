package service;

import model.Employee;
import model.Guest;
import model.enums.EventType;
import model.enums.Role;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class EventSimulationImpl implements EventSimulation{
    @Override
    public void organiseEvent(EventType type, List<Employee> staff, List<Guest> guests) {
        Random random = new Random();
        if (checkStaff(staff) == true) {
            if (type == EventType.COCKTAIL_PARTY) {
                cocktailParty(random, staff);
            } else if (type == EventType.WEDDING) {
                wedding(random, staff);
            } else if (type == EventType.CONFERENCE) {

            }
        }
        else {
            System.out.println("The company is understaffed and can't organise events");
        }
    }

    @Override
    public String mostTimesChief(List<Employee> staff) {
    Employee topChief= staff.stream()
                .max(Comparator.comparingInt(Employee::getOrgHistory)).get();
            return topChief.getName();
    }

    private boolean checkStaff(List<Employee> staff) {
        int helperAmount = 0;
        int organiserAmount = 0;
        for (Employee employee: staff
             ) {
            if (employee.getRole() == Role.HELPER) {
                helperAmount++;
            }
            else if (employee.getRole() == Role.ORGANISER) {
                organiserAmount++;
            }
        }
        if (helperAmount >= 10 && organiserAmount >= 3) {
            return true;
        }
        else {
            return false;
        }
    }

    private void cocktailParty(Random random, List<Employee> staff) {
        int cocktailStock = random.nextInt(30);
        String chief = selectChief(getOrganizers(staff));
        System.out.println("The chief organiser is: " + chief);
        System.out.println("The cocktail stock is: " + cocktailStock);
        for (int i = 0; i < random.nextInt(29); i++) {
            cocktailStock--;
            System.out.println("Guest requested a cocktail, remaining cocktails: " + cocktailStock);
        }
    }

    private void wedding(Random random, List<Employee> staff) {
        int isCakePresent = random.nextInt(2);
        if(isCakePresent != 1) {
            System.out.println("Wedding failed, forgot cake");
            String chief = selectChief(getOrganizers(staff));
            System.out.println("The chief organiser is: " + chief);
        }
        else {
            System.out.println("Successful wedding");
            String chief = selectChief(getOrganizers(staff));
            System.out.println("The chief organiser is: " + chief);
        }
    }

    private void conference(Random random, List<Employee> staff, List<Guest> guests){
        for (Guest guest: guests
             ) {
            int wantsGoodies = random.nextInt(2);
            if (wantsGoodies == 1) {
                if(guest.getHadAGoodieBag() == false) {
                    guest.setHadAGoodieBag(true);
                    System.out.println("Guest took a goodie bag");
                }
            }
        }
        System.out.println("Successful conference");
        String chief = selectChief(getOrganizers(staff));
        System.out.println("The chief organiser is: " + chief);
    }

    private String selectChief(List<Employee> organisers) {
        Random random = new Random();
        int selectedOrganiser = random.nextInt(organisers.size());
        organisers.get(selectedOrganiser).setOrgHistory(organisers.get(selectedOrganiser).getOrgHistory() + 1);
        return organisers.get(selectedOrganiser).getName();
    }
    private List<Employee> getOrganizers(List<Employee> staff) {
        return staff.stream()
                .filter(employee -> employee.getRole() == Role.ORGANISER)
                .collect(Collectors.toList());
    }
}
