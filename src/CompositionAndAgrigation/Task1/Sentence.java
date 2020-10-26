package CompositionAndAgrigation.Task1;

public class Sentence {
    private String sentence = "";

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public Sentence(Word word) {

    }

    public void addWord(Word word){
        sentence += word+" ";
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "" + sentence;
    }
}
