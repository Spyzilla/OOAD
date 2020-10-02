package Animal.Pachyderm;

public class Rhino extends Pachyderm  {

    public Rhino(String name) {     //Give name to Rhino
        super(name, new NoiseGrunts());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Rhino";
    }

}
