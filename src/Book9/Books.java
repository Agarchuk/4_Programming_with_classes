package Book9;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    ArrayList<Book> books = new ArrayList<>();

    public Books(Book[] book) {
        for (int i =0; i<book.length; i++){
            books.add(book[i]);
        }
    }

    public void chooseAction(){
        Scanner in = new Scanner(System.in);
        System.out.println("Список действий:\n" +
                "a) список книг заданного автора;\n" +
                "b) список книг, выпущенных заданным издательством;\n" +
                "c) список книг, выпущенных после заданного года.");
        System.out.print("Выберите действие: ");
        String choose = in.nextLine();
        switch (choose){
            case "a":
                listByAuthor(in.nextLine());
                break;
            case "b":
                listByPublisher(in.nextLine());
                break;
            case "c":
                listByYear(in.nextInt());
                break;
        }
    }

    public void listByAuthor(String author){
        for (int i =0; i<this.books.size(); i++){
            if(!this.books.get(i).getAuthor().equals(author)){
                this.books.remove(i);
                i--;
            }
        }
    }

    public void listByPublisher(String publisher){
        for (int i =0; i<this.books.size(); i++){
            if(!this.books.get(i).getPublisher().equals(publisher)){
                this.books.remove(i);
                i--;
            }
        }
    }
    public void listByYear(int year){
        for (int i =0; i<this.books.size(); i++){
            if(this.books.get(i).getYear()<year){
                this.books.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }


    @Override
    public String toString() {
        return "Список книг: " + books;
    }
}
