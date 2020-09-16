package com.cs4448.project1;

public class Hippo extends Pachyderm  {

    public Hippo(String name) {     //Give name to hippo
        super(name);
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Hippo";
    }
    public void makeNoise() {       //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " growls");
    }

}
