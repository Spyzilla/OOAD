package com.cs4448.project1;

public class Lion extends Feline {

    public Lion(String name) {      //Give name to lion
        super(name);
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Lion";
    }
    public void makeNoise() {       //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " roars loudly");
    }

}
