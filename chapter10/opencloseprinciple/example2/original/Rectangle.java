package chapter10.opencloseprinciple.example2.original;

class Rectangle {
    private int width;
    private int height;
    private int[] topLeftStartPoint;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setTopLeftStartPoint(int[] topLeftStartPoint) {
        this.topLeftStartPoint = topLeftStartPoint;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[] getTopLeftStartPoint() {
        return topLeftStartPoint;
    }
}
