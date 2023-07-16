package w3d5_2;

class Circle extends Shape {
    private static final double PI= 3.14;
    private double radius;

    public Circle(String color, double radius) {
        //TODO
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        //TODO
        return PI * radius * radius;
    }

    public void printCircleInfo() {
        //TODO
        super.printInfo();
        System.out.println("원의 반지름: " + radius);
    }
}
