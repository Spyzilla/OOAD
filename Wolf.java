package com.cs4448.project1;

public class Wolf extends Canine {

    public Wolf(String name) {      //Give name to wolf
        super(name);
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Wolf";
    }
    public void makeNoise() {       //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " snarls");
    }

}
