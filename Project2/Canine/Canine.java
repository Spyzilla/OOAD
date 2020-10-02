package Animal.Canine;
import Animal.Animal;
import Animal.Noise;

public class Canine extends Animal{

    public Canine(String name) {
        super(name, true, new NoiseBark());
    }
    public Canine(String name, Noise noise) {
        super(name, true, noise);
    }

    @Override
    public String toString() {
        return "Canine";
    }
    public void roam() {
        System.out.println(this.name + " the " + this.toString() + " runs around");
    }

}
