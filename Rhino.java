package com.cs4448.project1;

public class Rhino extends Pachyderm  {

    public Rhino(String name) {
        super(name);
    }

    @Override                      //Override to return correct animal species
    public String toString() {
        return "Rhino";
    }
    public void makeNoise() {
        System.out.println(this.name + " the " + this.toString() + " grunts");
    }

}
