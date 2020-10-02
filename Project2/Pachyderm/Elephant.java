package Animal.Pachyderm;

public class Elephant extends Pachyderm  {

    public Elephant(String name) {     //Give name to elephant
        super(name, new NoiseTrumpet());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Elephant";
    }

}
