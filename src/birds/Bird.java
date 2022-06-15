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

    public void setMakeNoise() {System.out.println(this.getName() + "goes tweet tweet");}

    public void setName(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("Flap Flap");
    }
public Bird(){}
    public Bird(String name){
        this.setName(name);
    }
}
