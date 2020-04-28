import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus22;
    Person person1;
    BusStop busStop1;

    @Before
    public void before() {
        bus22 = new Bus("Ocean Terminal", 5);
        busStop1 = new BusStop("Ocean Terminal");
    }

    @Test
    public void checkDestination() {
        assertEquals("Ocean Terminal", bus22.getDestination());
    }

    @Test
    public void checkCapacity() {
        assertEquals(5, bus22.getCapacity());
    }

    @Test
    public void passengersCount() {
        assertEquals(0, bus22.getPassengersCount());
    }

    @Test
    public void canPickPassenger() {
        bus22.pickPassengerFromQueue(busStop1);
        assertEquals(1, bus22.getPassengersCount());
    }

    @Test
    public void canOnlyAddFivePassenger() {
        bus22.pickPassengerFromQueue(busStop1);
        bus22.pickPassengerFromQueue(busStop1);
        bus22.pickPassengerFromQueue(busStop1);
        bus22.pickPassengerFromQueue(busStop1);
        bus22.pickPassengerFromQueue(busStop1);
        bus22.pickPassengerFromQueue(busStop1);
        assertEquals(5, bus22.getPassengersCount());
    }

    @Test
    public void passengerCanGetOff() {
        busStop1.addPersonToQueue(person1);
        bus22.pickPassengerFromQueue(busStop1);
        bus22.removePassenger();
        assertEquals(0, bus22.getPassengersCount());
    }


}


//    Create a pickUp method in bus that gets person from bus stop and adds to bus passengers.