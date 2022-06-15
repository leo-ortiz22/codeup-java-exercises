package shapes;

public class Square extends Rectangle{

    private int side;

    public Square(int side) {
        super(side,side);
        this.side = side;

    }

    @Override
    public int getArea() {
        System.out.println("This is the square method");
        return side * side;
    }

    @Override
    public int getPerimeter() {
        System.out.println("This is the square method");

        return side *4;
    }
}
