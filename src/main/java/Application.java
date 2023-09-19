import model.enums.EventType;
import model.repository.EventOrg;
import service.EventSimulation;
import service.EventSimulationImpl;


import java.util.Random;

public class Application {
    public static void main(String[] args) {
        EventSimulation eventSimulation = new EventSimulationImpl();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            eventSimulation.organiseEvent(EventType.CONFERENCE, EventOrg.staff, EventOrg.guests);
            eventSimulation.organiseEvent(EventType.WEDDING, EventOrg.staff, EventOrg.guests);
            eventSimulation.organiseEvent(EventType.COCKTAIL_PARTY, EventOrg.staff, EventOrg.guests);
        }
        System.out.println(eventSimulation.mostTimesChief(EventOrg.staff));
    }
}
