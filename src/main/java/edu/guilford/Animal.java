package edu.guilford;

public abstract class Animal{
    //attributes
    private String name;
    private String color;
    private double weight;
    private int age;

    //constructor
    public Animal(String name, String color, double weight, int age) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }


    //methods

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public abstract void hibernate();

    public abstract void makeSound();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
