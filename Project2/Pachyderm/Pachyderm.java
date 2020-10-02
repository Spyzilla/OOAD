package Animal.Pachyderm;
import Animal.Animal;
import Animal.Noise;

import java.util.Random;

public class Pachyderm extends Animal{

    public Pachyderm(String name) {
        super(name, true, new NoiseGrunts());
    }

    public Pachyderm(String name, Noise noise) {
        super(name, true, noise);
    }

    @Override
    public String toString() {
        return "Pachyderm";
    }
    public void roam() {
        System.out.println(this.name + " the " + this.toString() + " stomps around");
    }

    public void exercise() {
        Random rand = new Random();
        if (rand.nextInt(4) == 3) {
            System.out.println(this.name + " the " + this.toString() + " charges instead of roaming!");
        } else {
            this.roam();
        }
    }
}
