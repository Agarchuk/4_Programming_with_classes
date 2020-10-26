package CompositionAndAgrigation.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheel;
    private String color ="";

    public Car(String brand, String color) {
        this.brand = brand;
        this.engine = new Engine();
        this.wheel = new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()};
        this.color = color;
    }
    public void drive(){
        System.out.println("Поехали!");
        engine.setWork("включен");
    }
    public void fill (){
        System.out.print("Введите количество литров: ");
        engine.fill(Double.valueOf(input()));
    }
    public void changeWheel(){
        System.out.print("Какое колесо хотите поменять? ");
        int numOfWheel = Integer.valueOf(input());
        wheel[numOfWheel-1].repairWheel();
    }

    public void changeWheels(){
        System.out.print("Введите радиус колес: ");
        int r = Integer.valueOf(input());
        for (int i =0 ; i<wheel.length; i++){
            wheel[i] = new Wheel(r);
        }
        System.out.println("Хотите поменять резину на зимнюю? (y/n)");
        String answer = input();
        if (answer.equals("y")){
            for (int i =0; i <wheel.length; i++){
                wheel[i].changeTypeWheel();
            }
        }


    }

    public void info(){
        System.out.println(brand);
    }

    public static String  input(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    @Override
    public String toString() {
        return "Автомобиль: " + '\n' +
                "brand: " + brand + '\n' +
                ", engine: " + engine + '\n' +
                ", wheel: " + wheel[0] + '\n' +
                ", color: " + color;
    }
}
