package com.cs4448.project1;

public class Accipitrine extends Animal{

    Accipitrine(String name) {
        super(name, true);
    }

    @Override                      //Override to return correct animal kingdom
    public String toString() {
        return "Accipitrine";
    }
    public void roam() {
        System.out.println(this.name + " the " + this.toString() + " flies around");
    }

}
