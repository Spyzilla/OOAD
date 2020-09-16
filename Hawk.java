package com.cs4448.project1;

public class Hawk extends Accipitrine {

    public Hawk(String name) {      //Give name to hawk
        super(name);
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Hawk";
    }
    public void makeNoise() {       //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " screeches");
    }

}
