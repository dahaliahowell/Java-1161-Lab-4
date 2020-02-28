package garage;

public class Vehicle{
    private Owner owner;
    private String chassisNo;
    private String color;
    private int estimate;
    private int year;

    public Vehicle(String name, String teleNum, String chassisNo,
                    String color, int estimate, int year){
        this.owner = new Owner(name, teleNum);
        this.chassisNo = chassisNo;
        this.color = color;
        this.estimate = estimate;
        this.year = year;
    }

    public String getChassisNo(){
        return this.chassisNo;
    }

    public String getColor(){
        return this.color;
    }

    public int get_Estimate(){
        return this.estimate;
    }

    public int getYear(){
        return year;
    }

    public double serviceCharge(){
        return 0.01 * get_Estimate();
    }

    public String toString(){
        String result;
        result = owner.toString() + "\n";
        result += "Chassis Number: " + getChassisNo() + "\n";
        result += "Colour: " + getColor() + "\n";
        result += "Estimated Value: " + get_Estimate() + "\n";
        result += "Year: " + getYear() + "\n";
        result += "Service Charge: " + serviceCharge();

        return result;
    }
}