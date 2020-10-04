package Zoo;

public class Event { //This event class updates with each event the ZooKeeper and ZooFoodServer perform
    private String event;

    Event(String e) {
        this.event = e;
    }

    public String getEvent() {
        return this.event;
    }
}
