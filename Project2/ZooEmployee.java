package Zoo;
import java.util.LinkedList;

abstract public class ZooEmployee {

    private Zoo zoo;
    private boolean arrived;
    private Event current_event;
    private int currentDay;
    private String title;

    ZooEmployee(Zoo zoo) {
        this.zoo = zoo;
        this.currentDay = 1;
    }

    public Zoo getZoo() {
        return this.zoo;
    }

    public void setZoo(Zoo inZoo) {
        this.zoo = inZoo;
    }

    public String toString() {
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getDay() {
        return currentDay;
    }

    public void setDay(int day) {
        this.currentDay = day;
    }

    public Event getCurrent_event() { return this.current_event; }
    public void setCurrent_event(String event) { this.current_event = new Event(event); this.zoo.updateAnnouncer(this.current_event);}

    public void arrive(int day) {
        this.setCurrent_event("arrive");
        System.out.println("A " + this.toString() + " arrives at Zoo on day " + day);
        this.arrived = true;
    }

    public void leave() {
        this.setCurrent_event("leave");
        System.out.println("A " + this.toString() + " has left the Zoo on day " + currentDay + "\r");
        this.arrived = false;
        this.currentDay += 1;
    }

    public void update() {}

}

