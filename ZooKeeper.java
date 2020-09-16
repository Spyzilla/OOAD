package com.cs4448.project1;
import java.util.LinkedList;

public class ZooKeeper extends ZooEmployee {

    private Zoo zoo;
    private String title = "Zoo Keeper";

    ZooKeeper(Zoo inZoo) {  //Assign zookeeper to zoo
        super(inZoo);
        zoo = inZoo;
    }

    public void wakeUp() {  //Wake up function
        LinkedList<Animal> animals = zoo.getAnimals();
        for(Animal animal : animals){
            System.out.println("Zookeeper wakes " + animal.name + " the " + animal.toString());
            animal.wakeUp();
        }
    }

    public void rollCall() {    //Rollcall function
        LinkedList<Animal> animals = zoo.getAnimals();
        System.out.println("Zookeeper calls roll");
        for(Animal animal : animals) {
            animal.makeNoise();
        }
    }
    public void feed() {    //Feed function
        LinkedList<Animal> animals = zoo.getAnimals();
        for(Animal animal : animals) {
            System.out.println("Zookeeper feeds " + animal.name + " the " + animal.toString());
            animal.eat();
        }
    }
    public void roam() {    //Roam function
        LinkedList<Animal> animals = zoo.getAnimals();
        for(Animal animal : animals) {
            System.out.println("Zookeeper exercises " + animal.name + " the " + animal.toString());
            animal.roam();
        }
    }
    public void sleep() {   //Sleep function
        LinkedList<Animal> animals = zoo.getAnimals();
        for(Animal animal : animals) {
            System.out.println("Zookeeper puts " + animal.name + " the " + animal.toString() + " to sleep");
            animal.sleep();
        }
    }

    @Override                      //Override to return zookeeper
    public String toString() {
        return title;
    }
}

