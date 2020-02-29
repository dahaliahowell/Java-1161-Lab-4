package garage;

import java.util.*;

/**
 * The GSM class represents a Garage Managements System (GSM).
 * @author Dahalia Howell
 * @version 1.0
 */
public class GSM{

    ArrayList<Vehicle>vehicleList = new ArrayList<Vehicle>();
    private String garageName;

    /**
     * Constructor of GSM class - Creates a new GSM with a given name.
     * @param garageName
     */
    public GSM(String garageName){
        this.garageName = garageName;
    }

    /**
     * This method adds vehicle to vehicleList.
     * @param vehicle
     * @return Nothing.
     */
    public void addVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
    }

    /**
     * This method converts the arraylist of vehicles to an array.
     * @return array of vehicles.
     */
    public Object getVehicles(){
        Object[] vehicle = vehicleList.toArray();
        return vehicle;
    }

    /**
     * Setter Method - updates the name of the garage.
     * @return Nothing.
     */
    public void updateGarageName(String name){
        this.garageName = name;
    }

    /**
     * This method creates a string representation of a gsm object.
     * @return String This returns the string representation of a gsm object.
     */
    public String toString(){
        String result;
        result = "\n" + this.garageName + "\n\n";

        for (Vehicle vehicle:vehicleList){
            result += vehicle.toString() + "\n\n";
        }

        return result;
    }
}