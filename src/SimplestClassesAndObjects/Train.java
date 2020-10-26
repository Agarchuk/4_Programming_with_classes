package SimplestClassesAndObjects;

import java.util.GregorianCalendar;

public class Train {
    String destination;
    int numberOfTrain;
    int hours;
    int minutes;

    public Train(String destination, int numberOfTrain, int hours, int minutes) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.hours = hours;
        this.minutes = minutes;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Пункт назначения: " + destination +
                ", номер поезда: " + numberOfTrain +
                ", Время: " + hours +
                ":" + minutes;
    }
}
