package Animal.Accipitrine;

public class Falcon extends Accipitrine {

    public Falcon(String name) {    //Give name to falcon
        super(name, new NoiseWail());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Falcon";
    }

}
