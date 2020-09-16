package com.cs4448.project1;

public class Cat extends Feline {

    public Cat(String name) {      //Give name to cat
        super(name);
    }

    @Override                       //Override to return correct animal species
    public String toString() {
        return "Cat";
    }
    public void makeNoise() {       //Function for appropriate animal noise
        System.out.println(this.name + " the " + this.toString() + " meows");
    }

}
