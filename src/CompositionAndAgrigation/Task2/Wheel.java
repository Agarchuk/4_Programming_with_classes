package CompositionAndAgrigation.Task2;

public class Wheel {
    private String typeOfWheel = "летняя"; //летняя или зимняя
    private int radius = 24;

    public Wheel() {

    }
    public Wheel(int radius) {
        this.radius = radius;
    }

    public void repairWheel(){
        System.out.println("Колесо поменяно!");;
    }
    public void changeTypeWheel(){
        typeOfWheel = "зимняя";
    }

    public String getTypeOfWheel() {
        return typeOfWheel;
    }

    public void setTypeOfWheel(String typeOfWheel) {
        this.typeOfWheel = typeOfWheel;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "резина: " + typeOfWheel +
                ", радиус: " + radius;
    }
}
