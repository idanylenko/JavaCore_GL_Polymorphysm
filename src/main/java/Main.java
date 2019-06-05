import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape("BROWN");
        Circle circle = new Circle("BLUE", 10);
        System.out.println(shape);

        System.out.println(shape.calcArea());
        System.out.println(circle.calcArea());
        System.out.println(circle);

        Rectangle rectangle = new Rectangle("YELLOW", 5, 2);
        System.out.println(rectangle);
        System.out.println(rectangle.calcArea());


    }

}
