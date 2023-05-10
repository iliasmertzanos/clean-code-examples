package chapter10.dependencyinversion.refactored;

import java.util.List;

public class Project {
    private final List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void implement() {
        developers.forEach(Developer::develop);
    }
}
