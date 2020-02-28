package garage;

public class Owner{
    private String name;
    private String teleNum;

    public Owner(String name, String teleNum){
        this.name = name;
        this.teleNum = teleNum;
    }

    public String getOwnerName(){
        return this.name;
    }

    public String getTelephoneNum(){
        return this.teleNum;
    }

    public String toString(){
        String result;
        result = "\tOwner Name: " + this.name + "\n";
        result += "Telephone Number: " + this.teleNum;
        return result;
    }
}