package garage;

import java.text.DecimalFormat;

/**
 * The Vehicle class represents a vehicle.
 * @author Dahalia Howell
 * @version 1.0
 */
public class Vehicle{
    private Owner owner;
    private String chassisNo;
    private String color;
    private int estimate;
    private int year;
    private static DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Constructor of vehicle class - Creates a new owner with the given parameters.
     * @param name
     * @param teleNum
     * @param chassisNo
     * @param color
     * @param estimate
     * @param year
     */
    public Vehicle(String name, String teleNum, String chassisNo,
                    String color, int estimate, int year){
        this.owner = new Owner(name, teleNum);
        this.chassisNo = chassisNo;
        this.color = color;
        this.estimate = estimate;
        this.year = year;
    }

    /**
     * Getter Method - Provides access to the chassis number of a vehicle.
     * @return String This returns the chassis number of a vehicle.
     */
    public String getChassisNo(){
        return this.chassisNo;
    }

    /**
     * Getter Method - Provides access to the color of a vehicle.
     * @return String This returns the color of a vehicle.
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Getter Method - Provides access to the estimate of a vehicle.
     * @return int This the returns the estimate of a vehicle.
     */
    public int get_Estimate(){
        return this.estimate;
    }

    /**
     * Getter Method - Provides access to a vehicle's year of maufacture.
     * @return int This returns a vehicle's year of manufacture.
     */
    public int getYear(){
        return year;
    }

    /**
     * This method calculates the service charge of a vehicle.
     * @return double This returns a vehicle's service charge.
     */
    public double serviceCharge(){
        return 0.01 * get_Estimate();
    }

    /**
     * This method creates a string representation of a vehicle.
     * @return String This returns the string representation of a vehicle.
     */
    public String toString(){
        String result;
        result = owner.toString() + "\n";
        result += "Chassis Number: " + getChassisNo() + "\n";
        result += "Colour: " + getColor() + "\n";
        result += "Estimated Value: " + get_Estimate() + "\n";
        result += "Year: " + getYear() + "\n";
        result += "Service Charge: " + df.format(serviceCharge());

        return result;
    }
}