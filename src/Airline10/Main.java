package Airline10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Airlines airlines = new Airlines(new Airline[]{
                new Airline("Санкт-Петербург", 145, "Аэробус", "18:15", "Пятница"),
                new Airline("Москва", 33, "Боинг", "8:15", "Пятница"),
                new Airline("Брест", 45, "Аэробус", "9:30", "Среда"),
                new Airline("Москва", 44, "Аэробус", "13:45", "Среда")});
        System.out.println(airlines);
        airlines.action();
    System.out.println(airlines);
    }





    }

