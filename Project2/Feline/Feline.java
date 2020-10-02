package Animal.Feline;
import Animal.Animal;
import Animal.Noise;

import java.util.Random;

public class Feline extends Animal{

    public Feline(String name) {
        super(name, true, new NoiseRoar());
    }

    public Feline(String name, Noise noise) {
        super(name, true, noise);
    }

    @Override
    public String toString() {
        return "Feline";
    }
    public void roam() {
        System.out.println(this.name + " the " + this.toString() + " pounces");
    }

    public void sleep() {
        Random rand = new Random();
        int randomInt = rand.nextInt(9);
        if (randomInt <= 2) {
            this.roam();
        } else if (randomInt > 2 && randomInt <=5) {
            this.makeNoise();
        } else {
            this.sleep();
        }
    }

}
