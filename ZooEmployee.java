package com.cs4448.project1;
import java.util.LinkedList;

abstract public class ZooEmployee {

    private Zoo zoo;
    private boolean arrived;
    private int currentDay;

    ZooEmployee(Zoo zoo) {
        this.zoo = zoo;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void arrive(int day) {
        System.out.println("A " + this.toString() + " arrives at Zoo on day " + day);
        this.arrived = true;
        this.currentDay = day;
    }

    public void leave() {
        System.out.println("A " + this.toString() + " has left the Zoo on day " + currentDay + "\r");
        this.arrived = false;
    }
}
