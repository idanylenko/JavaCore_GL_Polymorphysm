
public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle("BLUE", 10);

        Rectangle rectangle1 = new Rectangle("YELLOW", 5, 2);

        Triangle triangle1 = new Triangle("BLACK", 5, 5, 5);


        Rectangle rectangle2 = new Rectangle("ORANGE", 6, 2);
        Rectangle rectangle3 = new Rectangle("BLACK", 4, 2);
        Rectangle rectangle4 = new Rectangle("BROWN", 5, 3);
        Rectangle rectangle5 = new Rectangle("PURPLE", 5, 1);
        Circle circle2 = new Circle("GREEN", 7);
        Triangle triangle2 = new Triangle("VIOLET", 7, 5, 4);

        Shape[] shapes = new Shape[]{rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, circle1, circle2, triangle1, triangle2};

        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;

        for (Shape elem : shapes) {
            System.out.print(elem.toString());
            System.out.print(", area is: ");
            System.out.println(elem.calcArea());
            sumArea += elem.calcArea();

            if (elem instanceof Rectangle) {
                sumRectArea += elem.calcArea();
            }
            if (elem instanceof Triangle) {
                sumTriangleArea += elem.calcArea();
            }
            if (elem instanceof Circle) {
                sumCircleArea += elem.calcArea();
            }
        }

        System.out.println("Total area is: " + sumArea);

        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Triangles total area: " + sumTriangleArea);
        System.out.println("Circles total area: " + sumCircleArea);







    }

}
