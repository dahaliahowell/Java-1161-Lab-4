package garage;

//import java.util.*;
import java.util.Scanner;

public class GarageUI{

    private static void pressKeyToReturnToMenu() {
        System.out.println("Press Enter key to return to the menu...");
        try {
            System.in.read();
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        GSM gsm = new GSM("COMP1161GARAGE");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String menu = "\nMenu\n";
            menu += "____________________________\n\n";
            menu += "1  Add vehicle.\n";
            menu += "2  Display garage.\n";
            menu += "3  Change garage name.\n";
            menu += "4  Exit.\n";
            menu += "____________________________\n\n";

            System.out.println(menu);
            System.out.println("Select an option by entering its corresponding number.");
            int option = scanner.nextInt();

            if (option == 1) {
                scanner.nextLine();
                System.out.println("Enter vehicle (Car/Truck): ");
                String vehicle = scanner.nextLine();

                if (vehicle.equalsIgnoreCase("car")) {
                    
                    System.out.print("Enter owner's name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter owner's telephone number: ");
                    String teleNum = scanner.nextLine();

                    System.out.print("Enter chassis no.: ");
                    String chassisNo = scanner.nextLine();

                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();

                    System.out.print("Enter estimate: ");
                    int estimate = scanner.nextInt();

                    System.out.print("Enter year of manufacture: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter body: ");
                    String body = scanner.nextLine();

                    System.out.print("Enter type: ");
                    String type = scanner.nextLine();

                    System.out.print("Enter CC rating: ");
                    int ccRating = scanner.nextInt();

                    gsm.addCar(name, teleNum, chassisNo, color, estimate, year, body, type, ccRating);

                    pressKeyToReturnToMenu();

                    continue;


                } else if (vehicle.equalsIgnoreCase("truck")){
                    System.out.print("Enter owner's name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter owner's telephone number: ");
                    String teleNum = scanner.nextLine();

                    System.out.print("Enter chassis no.: ");
                    String chassisNo = scanner.nextLine();

                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();

                    System.out.print("Enter estimate: ");
                    int estimate = scanner.nextInt();

                    System.out.print("Enter year of manufacture: ");
                    int year = scanner.nextInt();

                    System.out.print("Enter number of wheels: ");
                    int wheelNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter classification: ");
                    String classification= scanner.nextLine();
                    
                    gsm.addTruck(name, teleNum, chassisNo, color, estimate, year, wheelNo, TruckType.valueOf(classification));

                    pressKeyToReturnToMenu();

                    continue;
                } else{
                    System.out.println("Invalid option.");
                    pressKeyToReturnToMenu();
                    continue;
                }
            } else if (option == 2){

                System.out.println(gsm.toString());

                pressKeyToReturnToMenu();

                continue;

            } else if (option == 3){
                scanner.nextLine();
                System.out.print("Enter new garage name: ");
                String name = scanner.nextLine();

                gsm.updateGarageName(name);

                pressKeyToReturnToMenu();

                continue;

            } else if (option == 4){
                scanner.close();
                break;

            } else{
                System.out.println("Invalid option.");

                pressKeyToReturnToMenu();

                continue;
            }
        }    
    }
}