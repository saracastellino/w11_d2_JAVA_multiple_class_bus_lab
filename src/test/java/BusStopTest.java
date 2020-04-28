import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop busStop1;
    Person person1;

    @Before
    public void before() {
        busStop1 = new BusStop("Ocean Terminal");
    }

    @Test
    public void getQueueLength() {
        assertEquals(0, busStop1.getQueueLength());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop1.addPersonToQueue(person1);
        assertEquals(1, busStop1.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop1.addPersonToQueue(person1);
        busStop1.removePerson();
        assertEquals(0, busStop1.getQueueLength());
    }



}
