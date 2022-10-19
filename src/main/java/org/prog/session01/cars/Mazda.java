package org.prog.lesson1.cars;

public class Mazda implements ICar {

    public int speedLimit = 240;

    @Override
    public void drive() {
        System.out.println("Mazda goes with speadLimit: " + speedLimit);
    }

    @Override
    public void turn() {
        System.out.println("Mazda Turns ");
    }

    @Override
    public void slow() {
        System.out.println("Mazda slow down");
    }
}
