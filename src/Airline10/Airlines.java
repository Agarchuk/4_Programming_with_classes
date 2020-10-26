package Airline10;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Airlines {
    private ArrayList<Airline> airlines = new ArrayList<>();

    public Airlines(Airline[] airline) {
        for (int i = 0; i<airline.length; i++){
            this.airlines.add(airline[i]);
        }

    }
    public void action(){
        System.out.println("Список действий:\n" +
                "a) список рейсов для заданного пункта назначения;\n" +
                "b) список рейсов для заданного дня недели;\n" +
                "c) список рейсов для заданного дня недели, время вылета для которых больше заданного.");
        System.out.print("Выш выбор: ");
        switch (input()){
            case "a":
                listByDestination();
                break;
            case "b":
                listByDay();
                break;
            case "c":
                listByDayAndTime();
                break;
        }
    }

    public void listByDestination(){
        System.out.print("Введит пункт назначения: ");
        String destination = input();
        for (int i =0; i<airlines.size(); i++){
            if(!airlines.get(i).getDestination().equals(destination)){
                airlines.remove(i);
                i--;
            }
        }
    }
    public void listByDay(){
        System.out.print("Введит день недели: ");
        String day = input();
        for (int i =0; i<airlines.size(); i++){
            if(!airlines.get(i).getDays().equals(day)){
                airlines.remove(i);
                i--;
            }
        }
    }
    public void listByDayAndTime(){
        System.out.print("Введите день недели: ");
        String day = input();
        System.out.print("Введите время: ");
        String[] time = input().split(":");

        for (int i =0; i<airlines.size(); i++){
            System.out.println(airlines.get(i).getTimeOfDeparture().get(Calendar.HOUR_OF_DAY));
            if(!airlines.get(i).getDays().equals(day)){
                airlines.remove(i);
                i--;
            } else if(airlines.get(i).getTimeOfDeparture().get(Calendar.HOUR_OF_DAY)<Integer.valueOf(time[0])){
                airlines.remove(i);
                i--;

            } else if(airlines.get(i).getTimeOfDeparture().get(Calendar.HOUR_OF_DAY)==Integer.valueOf(time[0])&airlines.get(i).getTimeOfDeparture().get(Calendar.MINUTE)<Integer.valueOf(time[1])){
                airlines.remove(i);
                i--;
            }
        }

    }

    public String input(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public ArrayList<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(ArrayList<Airline> airlines) {
        this.airlines = airlines;
    }

    @Override
    public String toString() {
        return ""+airlines;
    }
}
