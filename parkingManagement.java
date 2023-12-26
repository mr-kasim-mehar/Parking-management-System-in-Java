import java.util.Scanner;
/**
 * Project: [Parking Management System]
 * Author: Muhammad Qasim Riaz
 * Organization: Gujranwala Institute of Future Technologies
 * Date: [26-December-2023]
 *
 * Description: [The Parking Management System is a comprehensive solution designed to streamline
 * and optimize the process of parking management for various establishments such as commercial 
 * buildings, residential complexes, shopping malls, and public spaces.]
 *
 * Fair Use Disclaimer:
 * This project may contain copyrighted material that has not been specifically authorized by the copyright owner.
 * The use of such materials is intended for educational and non-commercial purposes, constituting a 'fair use'
 * of any such copyrighted material as provided for in Section 107 of the U.S. Copyright Law and similar laws in
 * other jurisdictions. The distribution of this project is for academic and educational purposes only.
 *
 * If you believe that your copyrighted work is being infringed upon and you would like it to be removed from
 * this project, please contact us at [contact@email.com] with sufficient evidence for prompt removal.
 */
class parkingManagement {
    public static void main(String args[]) {

        ticketGenerator ticket;
        storeCarData storeData;
        ticket = new ticketGenerator();
        int tick = ticket.getTicket();

        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Parking Management System" +
                "\nAll the System is designed by Muhammad Qasim"
                + "\n\t\tVersion 1.1\n");

        System.out.print(">>>>>>>>>>>>>>>*Welcome to Menu of Car Management System*<<<<<<<<<<<<<<" +
                "\n1: Park your Car \n3: Get your Car back \n2: Exit the System" + "\n\"Press 1,2 or 3 to Select\": ");
        char choice = in.next().charAt(0);
        if (choice == '1') {
            Scanner in2 = new Scanner(System.in);
            int carNo, carModel;
            String carName;

            System.out.println("Your Ticket Number is: " + tick);
            System.out.println("Please Enter Your Car Details");
            System.out.print("Enter Car Number: ");
            carNo = in.nextInt();
            System.out.print("Enter Car Model No: ");
            carModel = in.nextInt();
            System.out.print("Enter Car Name: ");
            carName = in2.nextLine();
            //
            carData c1 = new carData(carNo, carModel, carName);
            // Storing the Car Data
            storeData = new storeCarData(5);
            storeData.addCar(0, c1);
            System.out.println(c1.toString());

        } else if (choice == '2') {
            System.out.println("Exiting...");
            System.exit(0);

        } else if (choice == '3') {
            System.out.print("Retrieve Your Car Back\nEnter the Ticket that you get: ");
            int tickEnter = in.nextInt();
            if (tickEnter == tick) {
                System.out.println("Your out of the Parking...");
                System.exit(0);

            } else {
                System.out.println("Invalid Ticket number You Dont get your car back!!!!!!!");
                System.exit(0);
            }

        }

        else {
            System.out.println("Invalid Input");

        }

    }
}
