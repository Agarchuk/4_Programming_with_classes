package CompositionAndAgrigation.Task2;

public class Engine {
    private String work = "выключен";
    private String typeOfFuel ="бензин"; //бензин, газ
    private double capacity = 2.5;
    private double fuel =0;

    public Engine() {
    }

    public Engine(String typeOfFuel, double capacity) {
        this.typeOfFuel = typeOfFuel;
        this.capacity = capacity;
    }

    public String getWork() {
        return work;
    }
    public void fill(double countOfLiters){

        fuel+=countOfLiters;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Двигатель " + work +
                ", тип топлива: " + typeOfFuel +
                ", объем двигателя: " + capacity+
                ", в баке "+ fuel+ " л. топлива";
    }
}
