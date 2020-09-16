package com.cs4448.project1;

public class Elephant extends Pachyderm  {

    public Elephant(String name) {      //Give name to elephant
        super(name);
    }

    @Override                           //Override to return correct animal species
    public String toString() {
        return "Elephant";
    }
    public void makeNoise() {           //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " trumpets");
    }

}
