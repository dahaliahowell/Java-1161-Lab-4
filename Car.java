package garage;

public class Car extends Vehicle{
    private String body;
    private String type;
    private int ccRating;

    public Car(String name, String teleNum, String chassisNo,
                String color, int estimate, int year, 
                String body, String type, int ccRating){
        super(name, teleNum, chassisNo, color, estimate, year);
        this.body = body;
        this.type = type;
        this.ccRating = ccRating;
    }

    public String getBody(){
        return this.body;
    }

    public String getType(){
        return this.type;
    }

    public int getCCRating(){
        return this.ccRating;
    }

    public double serviceCharge(){
        return (0.75 * get_Estimate()) / getCCRating();
    }

    public double serviceCharge(int othercharge){
        return this.serviceCharge() + othercharge;
    }

    public String toString(){
        String result;
        
        result = super.toString() + "\n";
        result += "Body: " + getBody() + "\n";
        result += "Type: " + getType() + "\n";
        result += "CC Rating: " + getCCRating();

        return result;
    }
}