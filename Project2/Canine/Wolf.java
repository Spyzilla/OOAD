package Animal.Canine;

public class Wolf extends Canine {

    public Wolf(String name) {     //Give name to wolf
        super(name, new NoiseHowl());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Wolf";
    }

}
