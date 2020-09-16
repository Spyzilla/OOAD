package com.cs4448.project1;
import java.util.Random;

public class Dog extends Canine {

    public Dog(String name) {      //Give name to dog
        super(name);
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Dog";
    }

    public void makeNoise() {       //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " barks");
    }

    public void roam() {            //Function for appropriate animal roaming
        Random rand = new Random(); //Function to give dog chance of digging instead of roaming
        if (rand.nextInt(4) == 3) {
            System.out.println(this.name + " the " + this.toString() + " digs instead of roaming!");
        } else {
            this.roam();
        }
    }

}
