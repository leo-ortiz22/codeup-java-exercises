package vehicles;

public class Car extends Vehicles {

public Car(){

}

    public Car(String name) {
        super(name);
    }

    public void brakingDownNoises() {
        super.makeNoise();
        System.out.println("Put putt chug chug");
    }
}
