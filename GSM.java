package garage;

import java.util.*;

public class GSM{
    ArrayList<Vehicle>vehicleList = new ArrayList<Vehicle>();
    private String garageName;

    public GSM(String garageName){
        this.garageName = garageName;
    }

    /*public void addVehicle(String name, String teleNum, String chassisNo,
                            String color, int estimate, int year){
        Vehicle vehicle = new Vehicle(name, teleNum, chassisNo, color, estimate, year);
        this.vehicleList.add(vehicle);
    }*/

    public void addCar(String name, String teleNum, String chassisNo,
                        String color, int estimate, int year, 
                        String body, String type, int ccRating){
        Car car = new Car(name, teleNum, chassisNo, color, estimate, year, body, type, ccRating);
        this.vehicleList.add(car);
    }

    public void addTruck(String name, String teleNum, String chassisNo,
                        String color, int estimate, int year, int wheelNo, 
                        TruckType classification){
        Truck truck = new Truck(name, teleNum, chassisNo, color, estimate, year, wheelNo, classification);
        this.vehicleList.add(truck);
    }

    public Object getVehicles(){
        Object[] vehicle = vehicleList.toArray();
        return vehicle;
    }

    public void updateGarageName(String name){
        this.garageName = name;
    }

    public String toString(){
        String result;
        result = this.garageName + "\n";

        for (Vehicle vehicle:vehicleList){
            result += vehicle.toString() + "\n\n";
        }

        return result;
    }
}