package shapes;

public class ShapeTest {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());


        Measurable mySquareShape = new Square(5);
        System.out.println(mySquareShape.getArea());
        System.out.println(mySquareShape.getPerimeter());

        Measurable myRectangleShape = new Rectangle(4, 5);
        System.out.println(myRectangleShape.getArea());
        System.out.println(myRectangleShape.getPerimeter());

//        Measurable measurable = new Rectangle();
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());


    }
}