package service;

import model.Employee;
import model.enums.EventType;
import model.enums.Role;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EventSimulationImpl implements EventSimulation{
    @Override
    public void organiseEvent(EventType type, List<Employee> staff) {
        Random random = new Random();
        if (type == EventType.COCKTAIL_PARTY) {
            cocktailParty(random, staff);
        }
        else if(type == EventType.WEDDING) {

        }
    }

    private void cocktailParty(Random random, List<Employee> staff) {
        int cocktailStock = random.nextInt(30);
        String chief = selectChief(getOrganizers(staff));
        System.out.println("The chief organiser is: " + chief);
        System.out.println("The cocktail stock is: " + cocktailStock);
        for (int i = 0; i < random.nextInt(29); i++) {
            --cocktailStock;
            System.out.println("Guest requested a cocktail, remaining cocktails: " + cocktailStock);
        }
    }

    private void wedding(Random random, List<Employee> staff) {
        int
    }

    private String selectChief(List<Employee> organisers) {
        Random random = new Random();
        return organisers.get(random.nextInt(organisers.size())).getName();
    }
    private List<Employee> getOrganizers(List<Employee> staff) {
        return staff.stream()
                .filter(employee -> employee.getRole() == Role.ORGANISER)
                .collect(Collectors.toList());
    }
}
