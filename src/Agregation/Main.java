package Agregation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите количество новых покупателей: ");
        int n = input();
        Customers customers = new Customers(n);
        System.out.println(customers);
        outputData(customers);
        System.out.println(customers);
    }
    public static int input(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }
    public static void outputData(Customers customers) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите  критерии выбора данных: ");
        System.out.println("a) список покупателей в алфавитном порядке;\n" +
                "b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
        System.out.print("Выбор: ");
        String choose = in.nextLine();
        switch (choose) {
            case "a":
                customers.sortByAlphabet();
                break;
            case "b":
                customers.sortByCard();
                break;
        }
    }
}
