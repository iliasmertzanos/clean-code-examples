package chapter10.singleresponsibility.original;

public class TextManager {

    private final String text;

    public TextManager(String text) {
        this.text = text;
    }

    public void appendText(String newText) {
    }

    public String findWordAndReplace(String word, String replacement) {
        return text;
    }

    public String findWordAndDelete(String word) {
        return text;
    }

    public void printText() {
        System.out.printf("""
                ########################
                %s
                ########################
                                
                %n""", this.text);
    }

    public Double parseStringToDouble(String string) {
        return Double.parseDouble(string);
    }
}