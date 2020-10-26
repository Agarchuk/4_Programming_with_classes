package Agregation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Customers {
    public int size;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Customers(int count) {
        size = count;
        for (int i = 0; i < count; i++) {
            addCustomer();
        }
    }

    private void addCustomer() {
        customers.add(createCustomer());
    }

    Customer createCustomer() {
        Scanner in = new Scanner(System.in);
        Customer customer = new Customer("", "", "", 0, 0);
        System.out.print("Введите Фамилию: ");
        customer.setSecondName(in.nextLine());
        System.out.print("Введите Имя: ");
        customer.setName(in.nextLine());
        System.out.print("Введите Отчество: ");
        customer.setMiddleName(in.nextLine());
        System.out.print("Введите номмер кредитной карточки: ");
        customer.setCreditCard(in.nextInt());
        System.out.print("Введиет номер банковского счета: ");
        customer.setBank(in.nextInt());
        return customer;
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }



    public void sortByAlphabet() {
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                int compare = customers.get(j).getSecondName().compareTo(customers.get(j - 1).getSecondName());
                if (compare < 0) {
                    Customer tmp = customers.get(j);
                    customers.set(j, customers.get(j - 1));
                    customers.set(j - 1, tmp);
                }

            }
        }
    }
    public void sortByCard() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите нижнюю границу a = ");
        int a = in.nextInt();
        System.out.print("Введите верхнюю границу b = ");
        int b = in.nextInt();
        for (int i = 0; i < size; i++){
            if(customers.get(i).getCreditCard()<a|customers.get(i).getCreditCard()>b){
                customers.remove(i);
            }
        }
    }


    @Override
    public String toString() {
        return "Покупатели:" + customers;
    }


}
