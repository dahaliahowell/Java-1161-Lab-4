/**
 * @author Dahalia Howell
 * @version 1.0
 */

package garage;

public class Owner{

    private String name;
    private String teleNum;

    /**
     * Constructor of Owner class
     * @param name
     * @param teleNum
     */
    public Owner(String name, String teleNum){
        this.name = name;
        this.teleNum = teleNum;
    }

    /**
     * Getter Method
     * @return String This returns the name of an owner.
     */
    public String getOwnerName(){
        return this.name;
    }

    /**
     * Getter Method
     * @return String This return the telephone number of an owner.
     */
    public String getTelephoneNum(){
        return this.teleNum;
    }

    /**
     * This method creates a string representation of an owner.
     * @return String This returns the string representation of an owner.
     */
    public String toString(){
        String result;

        result = "\tOwner Name: " + this.name + "\n";
        result += "Telephone Number: " + this.teleNum;
        return result;
    }
}