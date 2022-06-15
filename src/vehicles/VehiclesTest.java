package vehicles;

public class VehiclesTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Chevelle ");
        System.out.print(car.getName() + "goes ");
//        car.makeNoise();
        car.brakingDownNoises();

        Boat boat = new Boat();
        boat.setName("Big boat ");
        System.out.print(boat.getName()+ "goes ");
        boat.makeNoise();

    }
}
