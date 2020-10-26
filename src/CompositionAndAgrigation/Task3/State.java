package CompositionAndAgrigation.Task3;

public class State {
    private String nameOfState = "";
    private double square = 0;
    private Area area;
    private Region region;
    private City city;

    public State(String nameOfState, double square){
        this.nameOfState = nameOfState;
        this.square = square;
    }

    public void addArea(String area){
        this.area = new Area(area);
    }

    @Override
    public String toString() {
        return "State{" +
                "nameOfState='" + nameOfState + '\'' +
                ", square=" + square +
                ", area=" + area +
                ", region=" + region +
                ", city=" + city +
                '}';
    }
}
