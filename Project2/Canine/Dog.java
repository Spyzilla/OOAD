package Animal.Canine;
import java.util.Random;

public class Dog extends Canine {

    public Dog(String name) {     //Give name to dog
        super(name, new NoiseBark());
    }

    @Override                     //Override to return correct animal species
    public String toString() {
        return "Dog";
    }

    public void roam() {          //Function to make the dog dig
        Random rand = new Random();
        if (rand.nextInt(4) == 3) {
            System.out.println(this.name + " the " + this.toString() + " digs instead of roaming!");
        } else {
            this.roam();
        }
    }

}
