package w4d1;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(2, "기본색");
        this.width = width;
        this.height = height;
    }

    public double 대각선계산(){
        return Math.sqrt(width * width + height * height);
    }

    @Override
    public double 면적계산() {
        return width * height;
    }

    @Override
    public double 둘레계산() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

}