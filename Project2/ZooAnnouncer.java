package Zoo;

public class ZooAnnouncer extends ZooEmployee {
    ZooAnnouncer(Zoo zoo) {
        super(zoo);
        Zoo.addObserver(this);
    }

    public void updateAnnouncer(Event event) { //This is where our ZooAnnouncer turns into an observer, observing the events going on in the zoo
        switch(event.getEvent()) {
            case "arrive":
                System.out.println("Announcer: The zookeeper is about to arrive.");
                break;
            case "wakeup":
                System.out.println("Announcer: The zookeeper is about to wake the animals.");
                break;
            case "rollcall":
                System.out.println("Announcer: The zookeeper is about to roll call the animals.");
                break;
            case "exercise":
                System.out.println("Announcer: The zookeeper is about to exercise the animals.");
                break;
            case "feed":
                System.out.println("Announcer: The zookeeper is about to feed the animals.");
                break;
            case "lunch":
                System.out.println("Announcer: Lunch is about to be served.");
                break;
            case "dinner":
                System.out.println("Announcer: Dinner is about to be served");
                break;
            case "sleep":
                System.out.println("Announcer: The zookeeper is about to put the animals to sleep.");
                break;
            case "leave":
                System.out.println("Announcer: The zookeeper is about to leave for the day.");
                break;
        }
    }
}
