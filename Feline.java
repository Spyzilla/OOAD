package com.cs4448.project1;

import java.util.Random;

public class Feline extends Animal{

    Feline(String name) {
        super(name, true);
    }

    @Override                           //Override to return correct animal kingdom
    public String toString() {
        return "Feline";
    }
    public void roam() {                //Function for appropriate animal roaming
        System.out.println(this.name + " the " + this.toString() + " pounces");
    }

    public void sleep() {
        Random rand = new Random();     //Add chance for feline to roam or make noise instead of sleeping
        int randomInt = rand.nextInt(9);
        if (randomInt <= 2) {
            this.roam();
        } else if (randomInt > 2 && randomInt <=5) {
            this.makeNoise();
        } else {
            this.sleep();
        }
    }

}
