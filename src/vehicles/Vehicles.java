package vehicles;

public class Vehicles {
    private String car;
    private String name;

    public String getName() {
        return name;
    }
    public void makeNoise(){
        System.out.println("Vroom Vroom");
    }

    public void setName(String name) {
        this.name = name;
    }

public Vehicles(){}

    public Vehicles(String name){
        this.name = name;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }




    }

