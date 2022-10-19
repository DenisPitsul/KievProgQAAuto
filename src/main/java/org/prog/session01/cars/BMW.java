package org.prog.lesson1.cars;

public class BMW implements ICar {
    public String color;
    public int speedLimit = 260;

    @Override
    public void drive() {
        System.out.println("BMW goes with speadLimit: " + speedLimit);
    }

    @Override
    public void turn() {
        System.out.println("Turn without signal");
    }

    @Override
    public void slow() {
        System.out.println("Has no brakes");
    }
}
