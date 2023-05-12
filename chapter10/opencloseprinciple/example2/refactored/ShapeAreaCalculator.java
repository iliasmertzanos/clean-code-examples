package chapter10.opencloseprinciple.example2.refactored;

import chapter10.opencloseprinciple.example2.original.NoSuchShapeException;

class ShapeAreaCalculator {

    public static double determineShapeArea(Shape shape) throws NoSuchShapeException {
       return shape.determineShapeArea();
    }
}
