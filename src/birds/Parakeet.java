package birds;

public class Parakeet extends Bird implements birds.Pet {
    @Override
    public void doCuteThing() {
        System.out.println("Human just went awwwwwww");
    }
}