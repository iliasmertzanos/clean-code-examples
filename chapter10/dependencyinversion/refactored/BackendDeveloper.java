package chapter10.dependencyinversion.refactored;

public class BackendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava() {
        System.out.println("I am writing JAVA code");
    }
}
