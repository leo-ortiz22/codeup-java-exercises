package shapes;

public class Circle {
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public double getArea(){
        return (this.radius * this.radius * Math.PI);
    }

    public double getCircumference(){
        return (this.radius * 2 * Math.PI);
    }
}
