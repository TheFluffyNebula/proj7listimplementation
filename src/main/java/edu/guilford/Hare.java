package edu.guilford;

import java.util.Random;

public class Hare extends Animal implements Comparable<Hare>{
    //attributes
    private int speed;

    //constructor
    public Hare(String name, String color, double weight) {
        //making speed random
        super(name, color, weight, 0);
        Random rand = new Random();
        this.speed = rand.nextInt(100);
    }

    //getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Speed cannot be negative");
        } else {
            this.speed = speed;
        }
    }

    //methods
    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void hibernate() {
        System.out.println("I don't hibernate");
    }

    public void makeSound() {
        System.out.println("Hop! Hop! Hop!");
    }

    public int compareTo(Hare other) {
        int result =  Integer.compare(this.getSpeed(),other.getSpeed());
        return result;
    }

}
