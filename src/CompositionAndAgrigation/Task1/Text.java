package CompositionAndAgrigation.Task1;

public class Text {
    private String header;
    private String text="";

    public Text(Word word) {
        this.header = word.getWord();
    }

    public Text(Sentence sentence) {
        this.header = sentence.getSentence();
    }

    public void addtext(Sentence sentence){
        text +=sentence+" ";
    }
    public void addtext(Word word){
        text +=word+" ";
    }

    @Override
    public String toString() {
        return "Заголовок: " + header + '\n' +
                "text: " + text;
    }
}
