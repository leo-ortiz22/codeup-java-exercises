package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }
        public double getPerimeter() {
            return length * 4;
        }

        public double getArea() {
            return length * length;
        }

        public void setLength() {
        }

        public void setWidth() {
        }

    }

//
//    private int side;
//
//    public Square(int side) {
//        super(side,side);
//        this.side = side;
//
//    }
//
//    @Override
//    public int getArea() {
//        System.out.println("This is the square method");
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        System.out.println("This is the square method");
//
//        return side *4;
//    }
//}