package garage;

/**
 * The Truck class represents a truck which is a type of vehicle.
 * @author Dahalia Howell
 * @version 1.0
 */
public class Truck extends Vehicle{
    private int wheelNo;
    private TruckType classification;

    /**
     * Constructor of truck class - Creates a new truck with the given parameters.
     * @param name
     * @param teleNum
     * @param chassisNo
     * @param color
     * @param estimate
     * @param year
     * @param wheelNo
     * @param classification
     */
    public Truck(String name, String teleNum, String chassisNo,
                String color, int estimate, int year, int wheelNo, 
                TruckType classification){
        super(name, teleNum, chassisNo, color, estimate, year);
        this.wheelNo = wheelNo;
        this.classification = classification;
    }

    /**
     * Getter Method - Provides access to the number of wheels that a truck has.
     * @return int This returns the number of wheels that a truck has. 
     */
    public int getWheelNo(){
        return this.wheelNo;
    }

    /**
     * Getter Method - Provides access to the classification of a truck.
     * @return TruckType This returns the classification of a truck.
     */
    public TruckType getClassification(){
        return this.classification;
    }

    /**
     * This method creates a string representation of a truck.
     * @return String This returns the string representation of a truck.
     */
    public String toString(){
        String result;
        result = super.toString() + "\n";
        result += "Wheels: " + getWheelNo() + "\n";
        result += "Classification: " + getClassification();
        return result;
    }
}