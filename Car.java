package garage;

/**
 * The Car class represents a car which is a type of vehicle.
 * @author Dahalia Howell
 * @version 1.0
 */
public class Car extends Vehicle{

    private String body;
    private String type;
    private int ccRating;

    /**
     * Constructor of Car Class - Creates a new car with the given parameters.
     * @param name
     * @param teleNum
     * @param chassisNo
     * @param color
     * @param estimate
     * @param year
     * @param body
     * @param type
     * @param ccRating
     */
    public Car(String name, String teleNum, String chassisNo,
                String color, int estimate, int year, 
                String body, String type, int ccRating){
        super(name, teleNum, chassisNo, color, estimate, year);
        this.body = body;
        this.type = type;
        this.ccRating = ccRating;
    }

    /**
     * Getter Method - Provides access to the body of a car.
     * @return String This returns the body of a car.
     */
    public String getBody(){
        return this.body;
    }

    /**
     * Getter Method - Provides access to the type of a car.
     * @return String This returns the type of a car.
     */
    public String getType(){
        return this.type;
    }

    /**
     * Getter Method - Provides access to the cc rating of a car.
     * @return int This returns the cc rating of a car.
     */
    public int getCCRating(){
        return this.ccRating;
    }

    /**
     * This method calculates the service charge of a car.
     * @return double This returns a car's service charge.
     */
    public double serviceCharge(){
        return (0.75 * get_Estimate()) / getCCRating();
    }

    /**
     * This method adds an additional charge to the regular service charge.
     * @param othercharge
     * @return double This returns the sum of the additional charge and the regular service charge.
     */
    public double serviceCharge(int othercharge){
        return this.serviceCharge() + othercharge;
    }

    /**
     * This method creates a string representation of a car.
     * @return String This returns the string representation of a car.
     */
    public String toString(){
        String result;
        
        result = super.toString() + "\n";
        result += "Body: " + getBody() + "\n";
        result += "Type: " + getType() + "\n";
        result += "CC Rating: " + getCCRating();

        return result;
    }
}