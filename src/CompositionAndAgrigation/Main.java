package CompositionAndAgrigation;

import CompositionAndAgrigation.Task1.Sentence;
import CompositionAndAgrigation.Task1.Text;
import CompositionAndAgrigation.Task1.Word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Сколько слов желаете ввести? ");
        int n = Integer.parseInt(input());
        Word[] words = new Word[n];
        for (int i = 0; i<n ;i++){
            System.out.print("Введите слово: ");
            words[i]= new Word();
        }
        Sentence sentence = new Sentence("");
        for (int i = 0; i<n ;i++){
            sentence.addWord(words[i]);
        }
        System.out.print("Введите заголовок: ");
        Word header = new Word();
        Text text = new Text(header);
        text.addtext(sentence);
        System.out.print("Введите слово: ");
        text.addtext(new Word());

        System.out.println(text);
//        for (int i = 0; i<n ;i++){
//            System.out.println(words[i]);
//        }



    }

    public static String input(){
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
