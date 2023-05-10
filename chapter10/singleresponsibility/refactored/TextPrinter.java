package chapter10.singleresponsibility.refactored;

public class TextPrinter {

    private final String text;

    public TextPrinter(String text) {
        this.text = text;
    }


    public void printText() {
        System.out.printf("""
                ########################
                %s
                ########################
                %n""", this.text);
    }

    public void printOutEachWord() {

    }

    public void printRangeOfChars() {

    }
}