package Animal;

public abstract class Animal {

    private boolean asleep;
    protected String name;
    private Noise noise;

    public Animal(String name) {
        this.name = name;
        this.asleep = false;
    }

    public Animal(String name, boolean asleep) {
        this.name = name;
        this.asleep = asleep;
        this.noise = new NoiseDefault();
    }

    public Animal(String name, boolean asleep, Noise noise) {   //Our noises utilize the strategy pattern
        this.name = name;
        this.asleep = asleep;
        this.noise = noise;
    }

    public void wakeUp() {
        if (this.asleep) {
            System.out.println(this.name + " the " + this.toString() + " woke up");
            this.asleep = false;
        } else {
            System.out.println(this.name + " the " + this.toString() + " is already awake!");
        }
    }

    public String getName() {
        return name;
    }

    public void makeNoise()  {
        noise.makeNoise();
    }

    public void eat() {
        System.out.println(this.name + " the " + this.toString() + " eats");
    }

    public void roam() {
        System.out.println(this.name + " the " + this.toString() + " roams");
    }

    public void sleep() {
        if (!this.asleep) {
            System.out.println(this.name + " the " + this.toString() + " fell asleep");
            this.asleep = true;
        } else {
            System.out.println(this.name + " the " + this.toString() + " is already sleeping!");
        }
    }
}
