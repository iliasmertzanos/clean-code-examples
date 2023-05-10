package chapter10.dependencyinversion.refactored;

public class FrontendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJavascript();
    }

    public void writeJavascript() {
        System.out.println("I am write Javascript Code");
    }
}
