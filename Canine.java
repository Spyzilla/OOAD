package com.cs4448.project1;

public class Canine extends Animal{

    Canine(String name) {
        super(name, true);
    }

    @Override                       //Override to return correct animal kingdom
    public String toString() {
        return "Canine";
    }
    public void roam() {            //Function for appropriate animal roaming
        System.out.println(this.name + " the " + this.toString() + " runs around");
    }

}
