package chapter10.dependencyinversion.original;

public class Project {
    private final BackendDeveloper backendDeveloper;
    private final FrontEndDeveloper frontEndDeveloper;

    public Project(BackendDeveloper backendDeveloper, FrontEndDeveloper frontEndDeveloper) {
        this.backendDeveloper = backendDeveloper;
        this.frontEndDeveloper = frontEndDeveloper;
    }

    public void implement() {
        backendDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}
