package garage;

public class Truck extends Vehicle{
    private int wheelNo;
    private TruckType classification;

    public Truck(String name, String teleNum, String chassisNo,
                String color, int estimate, int year, int wheelNo, 
                TruckType classification){
        super(name, teleNum, chassisNo, color, estimate, year);
        this.wheelNo = wheelNo;
        this.classification = classification;
    }

    public int getWheelNo(){
        return this.wheelNo;
    }

    public TruckType getClassification(){
        return this.classification;
    }

    public String toString(){
        String result;
        result = super.toString() + "\n";
        result += "Wheels: " + getWheelNo() + "\n";
        result += "Classification: " + getClassification();
        return result;
    }
}