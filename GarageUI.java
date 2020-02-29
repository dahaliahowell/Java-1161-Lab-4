/**
 * @author Dahalia Howell
 * @version 1.0
 */

package garage;

import java.util.Scanner;

public class GarageUI{

    /**
     * This method allows to user to press the enter key to return to the menu.
     */
    private static void pressKeyToReturnToMenu() {
        System.out.println("Press Enter key to return to the menu...");
        try {
            System.in.read();
        } catch (Exception e) {}
    }

    /**
     * Main Method - entry point of Java program
     * @param args unused
     */
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

                    Car car = new Car(name, teleNum, chassisNo, color, estimate, year, body, type, ccRating);

                    gsm.addVehicle(car);

                    System.out.println("\n\nThe car was successfully added to the garage.\n\n");

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
                    
                    Truck truck = new Truck(name, teleNum, chassisNo, color, estimate, year, wheelNo, TruckType.valueOf(classification));

                    gsm.addVehicle(truck);

                    System.out.println("\n\nThe truck was successfully added to the garage.\n\n");

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
                System.out.print("Enter new garage name: \n");
                String name = scanner.nextLine();

                System.out.println("\nThe garage name was successfully changed.\n");

                gsm.updateGarageName(name);

                pressKeyToReturnToMenu();

                continue;

            } else if (option == 4){

                scanner.close();
                System.out.println("Exiting program...");
                break;

            } else{

                System.out.println("Invalid option.");

                pressKeyToReturnToMenu();

                continue;
            }
        }    
    }
}