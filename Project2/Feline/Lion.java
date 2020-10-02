package Animal.Feline;

public class Lion extends Feline {

    public Lion(String name) {     //Give name to lion
        super(name, new NoiseRoar());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Lion";
    }

}
