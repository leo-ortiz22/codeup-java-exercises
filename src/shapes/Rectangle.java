package shapes;

public class Rectangle {
    protected int width;
    private int area;
    private int perimeter;

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
        area = length * width;
        return area;
    }
    public int getPerimeter(){
        perimeter = 2 * length + 2 * width;
        return perimeter;
    }










}
