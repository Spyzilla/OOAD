package com.cs4448.project1;

import java.util.Random;

public class Pachyderm extends Animal{

    Pachyderm(String name) {
        super(name, true);
    }

    @Override                      //Override to return correct animal kingdom
    public String toString() {
        return "Pachyderm";
    }
    public void roam() {            //Function for appropriate animal roaming
        System.out.println(this.name + " the " + this.toString() + " stomps around");
    }

    public void exercise() {        //Add chance for pachyderm to charge instead of roam
        Random rand = new Random();
        if (rand.nextInt(4) == 3) {
            System.out.println(this.name + " the " + this.toString() + " charges instead of roaming!");
        } else {
            this.roam();
        }
    }
}
