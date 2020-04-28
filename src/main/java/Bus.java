import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengersCount() {
        return this.passengers.size();
    }

    public void pickPassengerFromQueue(BusStop busStop) {
        if(passengers.size() < capacity) {
            Person person = busStop.removePerson();
        this.passengers.add(person);}
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
