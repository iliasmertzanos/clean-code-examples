package chapter10.singleresponsibility.refactored;

public class TextManipulator {

    private final String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public void appendText(String newText){

    }

    public String findWordAndReplace(String word, String replacement){
        return text;
    }

    public String findWordAndDelete(String word){
        return text;
    }
}