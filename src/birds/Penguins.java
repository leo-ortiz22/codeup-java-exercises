package birds;

public class Penguins extends Bird{


    public static void makeNoise() {
    }

    @Override
    public String getMakeNoise() {
        return super.getMakeNoise();
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Whoosh Whoosh");
    }
}
