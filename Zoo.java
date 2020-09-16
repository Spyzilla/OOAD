package com.cs4448.project1;
import java.util.LinkedList;

public class Zoo {

    private LinkedList<Animal> animals;         //New linked list to store our animals in the zoo

    public Zoo() {
        this.animals = new LinkedList<Animal>();
    }

    public LinkedList<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }
}
