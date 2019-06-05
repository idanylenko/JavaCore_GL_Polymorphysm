public class Circle extends Shape{

    double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "This is " + super.toString() + ", radius = " + radius;
    }
}
