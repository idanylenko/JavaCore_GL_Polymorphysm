
public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape("BROWN");
        Circle circle1 = new Circle("BLUE", 10);
        System.out.println(shape);

        System.out.println(shape.calcArea());
        System.out.println(circle1.calcArea());
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle("YELLOW", 5, 2);
        System.out.println(rectangle1);
        System.out.println(rectangle1.calcArea());

        Triangle triangle1 = new Triangle("BLACK", 5, 5, 5);
        System.out.println(triangle1);
        System.out.println(triangle1.calcArea());


        Rectangle rectangle2 = new Rectangle("YELLOW", 6, 2);
        Rectangle rectangle3 = new Rectangle("BLACK", 4, 2);
        Rectangle rectangle4 = new Rectangle("BROWN", 5, 3);
        Rectangle rectangle5 = new Rectangle("PURPLE", 5, 1);
        Circle circle2 = new Circle("GREEN", 7);
        Triangle triangle2 = new Triangle("VIOLET", 7, 5, 4);

        Shape[] shapes = new Shape[]{rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, circle1, circle2, triangle1, triangle2};





    }

}
