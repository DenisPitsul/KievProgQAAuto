package org.prog.lesson1;

import org.prog.lesson1.cars.BMW;
import org.prog.lesson1.cars.ICar;
import org.prog.lesson1.cars.Mazda;
import org.prog.lesson1.cars.Volvo;

public class Main {

    public static void main(String... args) {

        Volvo volvo = new Volvo();
        Mazda mazda = new Mazda();

        BMW bmwRed = new BMW();
        BMW bmwBlue = new BMW();
        bmwRed.color = "red";
        changeColor(bmwRed, "yellow");
        changeColor(bmwRed, "cyan");

        bmwBlue.color = "blue";
        bmwBlue.color = "green";

        useCar(bmwRed);
        useCar(bmwBlue);
        useCar(volvo);
        useCar(mazda);

        System.out.println(bmwRed.color);
        System.out.println(bmwBlue.color);

    }

    public static void changeColor(BMW bmw, String color) {
        bmw.color = color;
    }

    public static void useCar(ICar iCar) {
        iCar.drive();
        iCar.turn();
        iCar.slow();
    }
}
