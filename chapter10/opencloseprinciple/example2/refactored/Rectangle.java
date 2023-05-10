package chapter10.opencloseprinciple.example2.refactored;

class Rectangle implements Shape {
    private int width;
    private int height;
    private int[] topLeftStartPoint;

    public double determineShapeArea() {
        return width * height;
    }
}
