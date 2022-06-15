package birds;

public class Bird {

private String name;

    public String getName() {
        return name;
    }
    private static String makeNoise;

    public String getMakeNoise() {
        return makeNoise;
    }

    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
    }

    public static void setName(String name) {
        name = name;
    }
    public void move(){
        System.out.println("Flap Flap");
    }
}
