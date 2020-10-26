package Airline10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Airline {
    private String destination;
    private int numberOfFlight;
    private String typeOfPlane;
    private Calendar timeOfDeparture = new GregorianCalendar();
    private String days;

    public Airline(String destination, int numberOfFlight, String typeOfPlane, String timeOfDeparture, String days) {
        this.destination = destination;
        this.numberOfFlight = numberOfFlight;
        this.typeOfPlane = typeOfPlane;
        String[] time = timeOfDeparture.split(":");
        this.timeOfDeparture.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
        this.timeOfDeparture.set(Calendar.MINUTE, Integer.parseInt(time[1]));
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public Calendar getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(Calendar timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Рейс:\n" +
                "Пункт назначения: " + destination + '\n' +
                "Номер рейса: " + numberOfFlight +'\n' +
                "Тип самолета: " + typeOfPlane + '\n' +
                "Время отправления: " + timeOfDeparture.get(Calendar.HOUR_OF_DAY)+":"+timeOfDeparture.get(Calendar.MINUTE) +'\n' +
                "День недели: " + days+ '\n';
    }
}
