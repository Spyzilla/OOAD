package Animal.Pachyderm;

public class Hippo extends Pachyderm  {

    public Hippo(String name) {     //Give name to hippo
        super(name, new NoiseGrowls());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Hippo";
    }

}
