package Animal.Feline;

public class Tiger extends Feline {

    public Tiger (String name) {     //Give name to tiger
        super(name, new NoiseRoar());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Tiger";
    }

}
