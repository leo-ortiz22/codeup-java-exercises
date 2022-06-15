package vehicles;

public class Garage{

private String name;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Vehicles[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles[] vehicles) {
        this.vehicles = vehicles;
    }
    public Vehicles findVehicle(String name, Vehicles[] vehicles){
        for(Vehicles vehicle: vehicles){
            if(vehicle.getName().equalsIgnoreCase(name)){
                return vehicle;
            }
        }
        return new Vehicles(null);
    }

    public Garage(){}

    public Garage(String name){
        this.name = name;
    }
    public void retrieveVehicles(){
        for(Vehicles vehicle: vehicles){
            vehicle.makeNoise();
        }
    }

    private Vehicles[] vehicles;
}
