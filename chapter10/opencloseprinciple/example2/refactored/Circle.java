package chapter10.opencloseprinciple.example2.refactored;

class Circle implements Shape {
    private int radius;
    private final double PI = 3.141592653589793;

    public double determineShapeArea() {
        return PI * radius * radius;
    }
}
