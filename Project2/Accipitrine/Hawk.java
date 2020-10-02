package Animal.Accipitrine;

public class Hawk extends Accipitrine {

    public Hawk(String name) {
        super(name, new NoiseScreech());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Hawk";
    }

}
