import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int getQueueLength() {
        return this.queue.size();
    }

    public void addPersonToQueue(Person person1) {
        this.queue.add(person1);
    }

    public Person removePerson() {
        if(queue.size() > 0) {
          return this.queue.remove(0);
        }
        return null;
    }
}