package com.cs4448.project1;

public class Tiger extends Feline {

    public Tiger (String name) {    //Give name to tiger
        super(name);
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Tiger";
    }
    public void makeNoise() {       //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " roars");
    }

}
