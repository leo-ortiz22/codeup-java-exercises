package vehicles;




public class GarageTest {

    public static void main(String[] args) {
        Garage GarageTest = new Garage("Leos Garage");


        Vehicles[] garageVehicles = new Car[3];
        garageVehicles[0] = new Car("Goldfinch");
        garageVehicles[1] = new Car("Duck");
        garageVehicles[2] = new Car("Penguin");
        GarageTest.setVehicles(garageVehicles);
        Vehicles vehicle1 = GarageTest.findVehicle("GoldFinch", GarageTest.getVehicles());
        System.out.println("i found the " + vehicle1.getName());
        GarageTest.retrieveVehicles();


    }

}