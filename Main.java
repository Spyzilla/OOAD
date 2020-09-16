//OOAD Project 1

//Aidan Anderson
//Jordan Hernandez
//Ahman Woods

package com.cs4448.project1;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Zoo zoo = new Zoo();                        //Create a new zoo
        ZooKeeper zookeeper = new ZooKeeper(zoo);   //Create a new zookeeper for the zoo
        Scanner scanner = new Scanner(System.in);
        zoo.addAnimal(new Cat("Chester"));          //Create all the animals
        zoo.addAnimal(new Dog("Dan"));
        zoo.addAnimal(new Elephant("Eric"));
        zoo.addAnimal(new Falcon("Fred"));
        zoo.addAnimal(new Hawk("Harry"));
        zoo.addAnimal(new Hippo("Hank"));
        zoo.addAnimal(new Lion("Larry"));
        zoo.addAnimal(new Tiger("Tony"));
        zoo.addAnimal(new Wolf("Wally"));
        zoo.addAnimal(new Rhino("Ray"));

        System.out.println("Enter number of days to simulate: ");
        int numDays = Integer.parseInt((scanner.nextLine()));

        for (int i = 0; i < numDays; i++) {         //Function to repeat days/actions
            zookeeper.arrive(i+1);
            zookeeper.wakeUp();
            zookeeper.rollCall();
            zookeeper.roam();
            zookeeper.feed();
            zookeeper.sleep();
            zookeeper.leave();
        }
    }
}