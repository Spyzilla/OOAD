package Zoo;
import Animal.Animal;
import java.util.LinkedList;

public class ZooKeeper extends ZooEmployee {
    public ZooKeeper(Zoo inZoo) {
        super(inZoo);
        this.setTitle("Zoo Keeper");
        Zoo.addObserver(this);
    }

    public void wakeUp()
    {
        this.setCurrent_event("wakeup");
        LinkedList<Animal> animals = getZoo().getAnimals();
        for(Animal animal : animals){
            System.out.println(this.toString() + " wakes " + animal.getName() + " the " + animal.toString());
            animal.wakeUp();
        }
    }

    public void rollCall() {
        this.setCurrent_event("rollcall");
        LinkedList<Animal> animals = getZoo().getAnimals();
        System.out.println(this.toString() + " calls roll");
        for(Animal animal : animals) {
            animal.makeNoise();
        }
    }
    public void feed() {
        this.setCurrent_event("feed");
        LinkedList<Animal> animals = getZoo().getAnimals();
        for(Animal animal : animals) {
            System.out.println(this.toString() + " feeds " + animal.getName() + " the " + animal.toString());
            animal.eat();
        }
    }
    public void roam() {
        this.setCurrent_event("roam");
        LinkedList<Animal> animals = getZoo().getAnimals();
        for(Animal animal : animals) {
            System.out.println(this.toString() + " exercises " + animal.getName() + " the " + animal.toString());
            animal.roam();
        }
    }
    public void sleep() {
        this.setCurrent_event("sleep");
        LinkedList<Animal> animals = getZoo().getAnimals();
        for(Animal animal : animals) {
            System.out.println(this.toString() + " puts " + animal.getName() + " the " + animal.toString() + " to sleep");
            animal.sleep();
        }
    }

    public void update() {
        int time = this.getZoo().getTime();
        switch(time) {
            case 8:
                arrive(this.getDay());
                break;
            case 9:
                wakeUp();
                break;
            case 10:
                rollCall();
                break;
            case 12:
                feed();
                break;
            case 15:
                roam();
                break;
            case 17:
                feed();
                break;
            case 19:
                sleep();
                break;
            case 20:
                leave();
                break;
        }
    }

}

