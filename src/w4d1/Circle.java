package w4d1;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super(2, "기본색");
        this.radius = radius;
    }

    public double 지름계산(){
        return 2 * radius;
    }

    @Override
    public double 면적계산() {
        return Math.PI * radius * radius;
    }

    @Override
    public double 둘레계산() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}