package com.cs4448.project1;

public class Falcon extends Accipitrine {

    public Falcon(String name) {    //Give name to falcon
        super(name);
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Falcon";
    }
    public void makeNoise() {       //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " wails");
    }

}
