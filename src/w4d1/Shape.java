package w4d1;

public abstract class Shape {

    private int dimension;
    private String color;

    public abstract double 면적계산();
    public abstract double 둘레계산();

    public Shape(int dimension, String color) {
        this.dimension = dimension;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimension() {
        return dimension;
    }

}