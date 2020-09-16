package com.cs4448.project1;

abstract public class Animal {  //Abstract class
                                //The animal class is a good example of abstraction as well as users 'see' each animal species, not the animal class itself
    private boolean asleep;     //Here is an example of encapuslation is it shows vartiables as well as methods inside the animal class
    protected String name;      //Animal as well as the kingdoms below it are good examples of ppolymorphism as it can be used to create all different types of kingdoms/species

    Animal(String name) {       //Each animal name is a good example of identity as they are tied to each individual animal
        this.name = name;
        this.asleep = false;
    }

    Animal(String name, boolean asleep) {
        this.name = name;
        this.asleep = asleep;
    }

    public void wakeUp() {
        if (this.asleep) {
            System.out.println(this.name + " the " + this.toString() + " woke up");
            this.asleep = false;
        } else {
            System.out.println(this.name + " the " + this.toString() + " is already awake!");
        }
    }

    public void makeNoise()  {
        System.out.println(this.name + " the " + this.toString() + " makes a noise");
    }

    public void eat() {
        System.out.println(this.name + " the " + this.toString() + " eats");
    }

    public void roam() {
        System.out.println(this.name + " the " + this.toString() + " roams");
    }

    public void sleep() {
        if (!this.asleep) {
            System.out.println(this.name + " the " + this.toString() + " fell asleep");
            this.asleep = true;
        } else {
            System.out.println(this.name + " the " + this.toString() + " is already asleep!");
        }
    }
}
