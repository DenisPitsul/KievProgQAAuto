package org.prog.lesson1.cars;

public class Volvo implements ICar {
    public int speedLimit = 220;

    @Override
    public void drive() {
        System.out.println("Drives up to " + speedLimit);
    }

    @Override
    public void turn() {
        System.out.println("turns safe");
    }

    @Override
    public void slow() {
        System.out.println("goes slow");
    }
}
