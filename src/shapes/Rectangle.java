package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }


        public void setLength() {

        }


        public double getPerimeter() {
            return (length * 2) + (width * 2);
        }


        public double getArea() {
            return length * width;
        }

        public void setLength(double length) {
            super.length = length;
        }


        public void setWidth() {

        }
    }
//    protected int width;
//    protected int length;
//
//    public Rectangle() {
//
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public int getArea(){
//        System.out.println("This is the rectangle method");
//
//        return length * width;
//    }
//    public int getPerimeter(){
//        System.out.println("This is the rectangle method");
//
//        return 2 * length + 2 * width;
//    }
//









