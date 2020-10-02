package Animal.Accipitrine;
import Animal.Animal;
import Animal.Noise;

public class Accipitrine extends Animal{

    public Accipitrine(String name) {
        super(name, true, new NoiseWail());
    }

    public Accipitrine(String name, Noise noise) {
        super(name, true, noise);
    }

    @Override
    public String toString() {
        return "Accipitrine";
    }
    public void roam() {
        System.out.println(this.name + " the " + this.toString() + " flies around");
    }

}
