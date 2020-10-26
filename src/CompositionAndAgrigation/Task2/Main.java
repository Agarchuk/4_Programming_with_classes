package CompositionAndAgrigation.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMV", "red");
        System.out.println(car);
        car.drive();
       System.out.println(car);
        car.fill();
        System.out.println(car);
        car.changeWheel();
        System.out.println(car);
        car.info();
        System.out.println(car);
        car.changeWheels();
        System.out.println(car);

    }

}
