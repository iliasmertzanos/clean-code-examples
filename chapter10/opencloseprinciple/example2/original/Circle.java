package chapter10.opencloseprinciple.example2.original;

class Circle {
    private int radius;
    private int[] centerPoint;

    public int getRadius() {
        return radius;
    }

    public int[] getCenterPoint() {
        return centerPoint;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCenterPoint(int[] centerPoint) {
        this.centerPoint = centerPoint;
    }
}
