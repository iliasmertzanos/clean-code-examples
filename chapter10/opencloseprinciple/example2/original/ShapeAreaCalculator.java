package chapter10.opencloseprinciple.example2.original;

class ShapeAreaCalculator {

    public static double determineShapeArea(Object shape) throws NoSuchShapeException {
        if (shape instanceof Circle circle) {
            final double PI = 3.141592653589793;
            return PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle r) {
            return r.getWidth() * r.getHeight();
        } else {
            throw new NoSuchShapeException();
        }
    }
}
