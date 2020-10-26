package CompositionAndAgrigation.Task3;

public class Area {
    private String nameOfArea = "";

    public Area(String nameOfArea){
        this.nameOfArea = nameOfArea;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nameOfArea='" + nameOfArea + '\'' +
                '}';
    }
}
