package Zoo;
import Animal.Animal;
import Animal.Accipitrine.*;
import Animal.Pachyderm.*;
import Animal.Feline.*;
import Animal.Canine.*;
import java.util.LinkedList;

public class Zoo {

    private LinkedList<Animal> animals;
    private LinkedList<ZooEmployee> employees;
    private ZooKeeper zookeeper = new ZooKeeper(this);
    private ZooAnnouncer zooannouncer = new ZooAnnouncer(this);
    private ZooFoodServer zoofoodserver = new ZooFoodServer(this);
    private static Clock clock = new Clock();

    public Zoo() {                                          //Create animals and employees
        this.animals = new LinkedList<Animal>();
        this.employees = new LinkedList<ZooEmployee>();
    }

    public LinkedList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    public void updateAnnouncer(Event event) { this.zooannouncer.updateAnnouncer(event); }

    public int getTime() {
        return this.clock.getTime();
    }

    public static void addObserver(ZooEmployee observer) {
        clock.addObserver(observer);
    }

    public static void startZoo(int numDays){
        clock.start(numDays);
    }

}
