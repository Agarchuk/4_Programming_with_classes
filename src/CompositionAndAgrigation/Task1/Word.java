package CompositionAndAgrigation.Task1;

import java.util.Scanner;

public class Word {
    private String word;

    public Word() {
        this.word = input();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String input(){
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    @Override
    public String toString() {
        return "" + word ;
    }

}

