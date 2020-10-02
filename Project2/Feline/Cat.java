package Animal.Feline;

public class Cat extends Feline {

    public Cat(String name) {     //Give name to cat
        super(name, new NoiseMeow());
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Cat";
    }

}
