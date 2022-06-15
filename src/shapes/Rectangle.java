package shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle() {

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getArea(){
        System.out.println("This is the rectangle method");

        return length * width;
    }
    public int getPerimeter(){
        System.out.println("This is the rectangle method");

        return 2 * length + 2 * width;
    }










}
