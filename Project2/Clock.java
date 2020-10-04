package Zoo;
import Animal.Animal;

import java.util.LinkedList;

public class Clock {
    private int time;
    private LinkedList<ZooEmployee> observers = new LinkedList<ZooEmployee>();

    public int getTime() {
        return time;
    }

    public void addObserver(ZooEmployee observer) {
        observers.add(observer);
    }

    public void runTime(int addTime) {
        for (ZooEmployee observer : observers) {
            observer.update();
        }
        time += addTime;
    }

    public void start(int numDays) {    //Run zoo for certain amount of days
        time = 0;
        for(int i = 1; i <= numDays; i++) {
            for (int j = 1; j<= 24; j++) {
                System.out.println("Current time: " + time + ":00");
                runTime(1);
            }
        }
    }


}
